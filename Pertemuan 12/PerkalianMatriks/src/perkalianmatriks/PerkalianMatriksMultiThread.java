/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perkalianmatriks;

import java.util.Date;

/**
 *
 * @author Dwinanda
 */
public class PerkalianMatriksMultiThread {

    public static void main(String[] args) {
        int[][] matrix1 = generateMatrix(1000, 1000);
        int[][] matrix2 = generateMatrix(1000, 1000);

        System.out.println("\nResult Matrix (Multi Thread):");
        long startTimeMultiThread = new Date().getTime();
        int[][] resultMultiThread = multiplyMatricesMultiThread(matrix1, matrix2);
        long endTimeMultiThread = new Date().getTime();
        //printMatrix(resultMultiThread);
        System.out.println("Execution time (Multi Thread): " + (endTimeMultiThread - startTimeMultiThread) + " ms");
    }

    public static int[][] multiplyMatricesMultiThread(int[][] firstMatrix, int[][] secondMatrix) {
        int r1 = firstMatrix.length;
        int c2 = secondMatrix[0].length;
        int[][] result = new int[r1][c2];

        Thread[] threads = new Thread[r1];
        for (int i = 0; i < r1; i++) {
            threads[i] = new Thread(new MultiplicationTask(firstMatrix, secondMatrix, result, i));
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
