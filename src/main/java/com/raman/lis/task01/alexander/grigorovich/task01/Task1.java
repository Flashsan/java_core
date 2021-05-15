package com.raman.lis.task01.alexander.grigorovich.task01;

public class Task1 {
    /*
     *Задание 1
     *Есть некоторый массив, состоящий из целых чисел, также есть некоторое число"n".
     *Суть задания посчитать сумму всех элементов массива, однако если в массиве
     *встречается число "n", то в сумму его включать не нужно.
     */
    public static void main(String[] args) {

        int[] array = {3, 7, 4, 8, 5, 5, 2, 5};
        int n = 5;
        int sum = 0;

        System.out.println("Our array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != n) {
                sum += array[i];
            }
        }

        System.out.println("\nSumma of elements our array is " + sum);

    }
}
