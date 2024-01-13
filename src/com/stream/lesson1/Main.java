package com.stream.lesson1;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int c = 2;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][c] = 1;
            c--;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
