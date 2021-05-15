package com.raman.lis.task01.alexander.grigorovich.task01;

public class Task6 {
    /*
     *Задание 6
     *Даны две квадратные матрицы. Необходимо написать программу которая посчитает их
     *сумму и разности.
     */
    public static void main(String[] args) {
        int[][] theFirstMatrix = {{1, 2}, {0, 4}};
        int[][] theSecondMatrix = {{1, 3}, {5, 6}};
        int[][] matrix = {{0, 0}, {0, 0}};

        System.out.println("The first matrix:");

        for (int i = 0; i < theFirstMatrix.length; i++) {
            for (int j = 0; j < theFirstMatrix.length; j++) {
                System.out.print(theFirstMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("The second matrix:");

        for (int i = 0; i < theSecondMatrix.length; i++) {
            for (int j = 0; j < theSecondMatrix.length; j++) {
                System.out.print(theSecondMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < theFirstMatrix.length; i++) {
            for (int j = 0; j < theSecondMatrix.length; j++) {
                matrix[i][j] = theFirstMatrix[i][j] + theSecondMatrix[i][j];
            }
        }

        System.out.println("Sum matrix:");

        for (int i = 0; i < theFirstMatrix.length; i++) {
            for (int j = 0; j < theSecondMatrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < theFirstMatrix.length; i++) {
            for (int j = 0; j < theSecondMatrix.length; j++) {
                matrix[i][j] = theFirstMatrix[i][j] - theSecondMatrix[i][j];
            }
        }

        System.out.println("Difference of matrix");

        for (int i = 0; i < theFirstMatrix.length; i++) {
            for (int j = 0; j < theSecondMatrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
