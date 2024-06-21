/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perkalianmatriks;

/**
 *
 * @author Dwinanda
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PerkalianMatriks {

    public static void main(String[] args) {
        int[][] matrix1 = generateMatrix(100, 100);
        int[][] matrix2 = generateMatrix(100, 100);

        System.out.println("Matrix 1:");
        //printMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        //printMatrix(matrix2);

        System.out.println("\nResult Matrix (Single Thread):");
        long startTimeSingleThread = System.currentTimeMillis();
        int[][] resultSingleThread = multiplyMatricesSingleThread(matrix1, matrix2);
        long endTimeSingleThread = System.currentTimeMillis();
        //printMatrix(resultSingleThread);
        System.out.println("Execution time (Single Thread): " + (endTimeSingleThread - startTimeSingleThread) + " ms");

        System.out.println("\nResult Matrix (Multi Thread):");
        long startTimeMultiThread = System.currentTimeMillis();
        int[][] resultMultiThread = multiplyMatricesMultiThread(matrix1, matrix2);
        long endTimeMultiThread = System.currentTimeMillis();
        //printMatrix(resultMultiThread);
        System.out.println("Execution time (Multi Thread): " + (endTimeMultiThread - startTimeMultiThread) + " ms");
    }

    public static int[][] multiplyMatricesSingleThread(int[][] firstMatrix, int[][] secondMatrix) {
        int r1 = firstMatrix.length;
        int c1 = firstMatrix[0].length;
        int c2 = secondMatrix[0].length;
        int[][] product = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return product;
    }

    public static int[][] multiplyMatricesMultiThread(int[][] firstMatrix, int[][] secondMatrix) {
        int r1 = firstMatrix.length;
        int c2 = secondMatrix[0].length;
        int[][] result = new int[r1][c2];

        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        for (int i = 0; i < r1; i++) {
            executor.execute(new MultiplicationTask(firstMatrix, secondMatrix, result, i));
        }

        executor.shutdown();

        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return result;
    }

    public static int[][] generateMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}

class MultiplicationTask implements Runnable {

    private int[][] matrix1;
    private int[][] matrix2;
    private int[][] result;
    private int row;

    public MultiplicationTask(int[][] matrix1, int[][] matrix2, int[][] result, int row) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.result = result;
        this.row = row;
    }

    @Override
    public void run() {
        int c2 = matrix2[0].length;
        for (int j = 0; j < c2; j++) {
            for (int k = 0; k < matrix1[0].length; k++) {
                result[row][j] += matrix1[row][k] * matrix2[k][j];
            }
        }
    }
}
