package com.raman.lis.task01.alexander.grigorovich.task01;

public class Task4 {
    /*
     *Задание 4
     *Дан некоторый двумерный массив. Нужно определить каких чисел в нем больше,
     *положительных или отрицательных.
     */
    public static void main(String[] args) {

        int[][] array = {{0, 4}, {-1, 3}};
        int countPositiveElement = 0;
        int countNegativeElement = 0;
        int countZeroElement = 0;

        System.out.println("Our matrix:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > 0) {
                    countPositiveElement++;
                } else if (array[i][j] < 0) {
                    countNegativeElement++;
                } else {
                    countZeroElement++;
                }
            }
        }

        System.out.println("Positive elements is " + countPositiveElement + "\n" +
                "Negative elements is " + countNegativeElement + "\n" +
                "Zero elements is " + countZeroElement);

    }
}
