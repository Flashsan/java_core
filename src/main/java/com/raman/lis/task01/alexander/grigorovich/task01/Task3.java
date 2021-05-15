package com.raman.lis.task01.alexander.grigorovich.task01;

public class Task3 {
    /*
     *Задание 3
     *Дан некоторый массив, суть задания инвертировать его.
     */
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int timeVariable;

        System.out.println("Initial array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        for (int i = 0; i < array.length / 2; i++) {
            timeVariable = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = timeVariable;
        }

        System.out.println("\nInverted array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

    }
}
