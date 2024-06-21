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
public class PerkalianMatriksSingleThread {

    public static void main(String[] args) {
        int[][] matrix1 = generateMatrix(1000, 1000);
        int[][] matrix2 = generateMatrix(1000, 1000);

        int[][] result = multiplyMatrices(matrix1, matrix2);
        System.out.println("\nResult Matrix (Single Thread):");
        long startTimeSingleThread = new Date().getTime();
        int[][] resultSingleThread = multiplyMatrices(matrix1, matrix2);
        long endTimeSingleThread = new Date().getTime();
        //printMatrix(resultSingleThread);
        System.out.println("Execution time (Single Thread): " + (endTimeSingleThread - startTimeSingleThread) + " ms");
    }

    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
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
