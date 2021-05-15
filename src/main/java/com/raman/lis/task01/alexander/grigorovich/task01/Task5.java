package com.raman.lis.task01.alexander.grigorovich.task01;

public class Task5 {
    /*
     *Задание 5
     *Дан некоторый двумерный массив. Нужно определить является ли он нижней
     *треугольной матрицей или же нет.
     *https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B0%D1%8F_%D0%BC%D0%B0%D1%82%D1%80%D0%B8%D1%86%D0%B0
     */
    public static void main(String[] args) {

        int array[][] = {{1, 2, 3}, {0, 4, 5}, {0, 0, 6,}}; //uppper triangular matrix
        //int array[][] = {{1, 0, 0}, {1, 4, 0}, {9, 5, 4}}; //lower triangular matrix
        //int array[][] = {{1, 0, 1}, {4, 1, 0}, {9, 5, 1}}; //unitriangular matrix
        //int array[][] = {{1, 0, 0}, {0, 1, 0}, {0, 0, 2}}; //diagonal matrix
        //int array[][] = {{1, 0, 1}, {1, 4, 0}, {9, 5, 4}}; //square matrix

        boolean uppperTriangularMatrix = false;
        boolean lowerTriangularMatrix = false;
        boolean unitriangularMatrix = false;
        boolean unknownMatrix = false;
        int countForUppperTriangularMatrix = 0;
        int countForLowerTriangularMatrix = 0;
        int countForUnitriangularMatrix = 0;

        System.out.println("Our matrix: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i > j) {
                    if (array[i][j] == 0) {
                        uppperTriangularMatrix = true;
                    } else {
                        countForUppperTriangularMatrix++;
                    }
                } else if (i < j) {
                    if (array[i][j] == 0) {
                        lowerTriangularMatrix = true;
                    } else {
                        countForLowerTriangularMatrix++;
                    }
                } else if (i == j) {
                    if (array[i][j] == 1) {
                        unitriangularMatrix = true;
                    } else {
                        countForUnitriangularMatrix++;
                    }
                }
            }
        }

        if (uppperTriangularMatrix && countForUppperTriangularMatrix == 0) {
            if (lowerTriangularMatrix && countForLowerTriangularMatrix == 0) {
                System.out.println("Diagonal matrix!");
            } else {
                System.out.println("Uppper triangular matrix!");
            }
        } else if (lowerTriangularMatrix && countForLowerTriangularMatrix == 0) {
            System.out.println("Lower triangular matrix!");
        } else if (unitriangularMatrix && countForUnitriangularMatrix == 0) {
            System.out.println("Unitriangular matrix!");
        } else if ((uppperTriangularMatrix && countForUppperTriangularMatrix == 0)
                && (lowerTriangularMatrix && countForLowerTriangularMatrix == 0)) {
        } else {
            System.out.println("Square matrix!");
        }

    }
}
