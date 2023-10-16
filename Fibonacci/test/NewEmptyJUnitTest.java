/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class MatrixDeterminantCalculator {
    public static double calculateDeterminant(double[][] matrix) {
        int n = matrix.length;

        if (n != matrix[0].length) {
            throw new IllegalArgumentException("A matriz deve ser quadrada (n x n).");
        }

        if (n == 1) {
            return matrix[0][0];
        }

        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        double determinant = 0;

        for (int i = 0; i < n; i++) {
            determinant += matrix[0][i] * getCofactor(matrix, 0, i);
        }

        return determinant;
    }

    private static double[][] getSubmatrix(double[][] matrix, int row, int col) {
        int n = matrix.length;
        double[][] submatrix = new double[n - 1][n - 1];

        for (int i = 0, destRow = 0; i < n; i++) {
            if (i == row) {
                continue;
            }
            for (int j = 0, destCol = 0; j < n; j++) {
                if (j == col) {
                    continue;
                }
                submatrix[destRow][destCol] = matrix[i][j];
                destCol++;
            }
            destRow++;
        }

        return submatrix;
    }

    private static double getCofactor(double[][] matrix, int row, int col) {
        double sign = (row + col) % 2 == 0 ? 1 : -1;
        double[][] submatrix = getSubmatrix(matrix, row, col);
        return sign * calculateDeterminant(submatrix);
    }
}