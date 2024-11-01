package com.kabaso.mock.week6;
import java.util.*;

class RotateBy90Matrix {

    // Function to rotate the matrix by 90 degrees clockwise
    static void rotate90(int[][] mat) {
        int n = mat.length;

        // Initialize the result matrix with zeros
        int[][] res = new int[n][n];

        // Flip the matrix clockwise using nested loops
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[j][n - i - 1] = mat[i][j];
            }
        }

        // Copy result back to mat
        for (int i = 0; i < n; i++) {
            System.arraycopy(res[i], 0, mat[i], 0, n);
        }
    }

    
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        rotate90(mat);

        // Print the rotated matrix
        for (int[] row : mat) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}