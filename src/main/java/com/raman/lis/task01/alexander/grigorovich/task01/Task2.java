package com.raman.lis.task01.alexander.grigorovich.task01;

public class Task2 {
    /*
     *Задание 2
     *Суть задания найти сумму всех четных чисел в последовательности Фибоначи,
     *до определенного индекса "n".
     *Например:
     *Последовательность: 0, 1, 1, 2, 3, 5, 8, 13, 21
     *n = 7
     *Сумма всех четных до 7го.  равна 2 + 8 = 10.
     */
    public static void main(String[] args) {

        int[] array = {0, 1, 1, 2, 3, 5, 8, 13, 21};
        int n = 7;
        int sum = 0;

        System.out.println("Our array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }

        System.out.println("\nSum all even elements of our array before specific index." +
                "\nSpecific index is " + n + "." +
                "\nSum is " + sum + ".");

    }
}
