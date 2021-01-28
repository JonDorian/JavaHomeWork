package com.tms.lesson5;

// Задание 16 из методички. Определите сумму элементов одномерного массива, расположенных между
//минимальным и максимальным значениями.

public class AmountBetweenMinAndMax {
  public static void main(String[] args) {
    int[] array = new int[10];
    int sum = 0;

    System.out.print("Исходный массив: ");
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 20);
      System.out.print(array[i] + " ");
    }

    System.out.println(" ");

    for (int one = 0; one < array.length - 1; one++) {
      for (int two = 0; two < array.length - 1 - one; two++) {
        if (array[two] > array[two + 1]) {
          int temp = array[two];
          array[two] = array[two + 1];
          array[two + 1] = temp;
        }
      }
    }

    System.out.print("Сортированный массив: ");
    for (int x : array) {
      System.out.print(x + " ");
    }

    System.out.println(" ");

    for (int x = 1; x < array.length - 1; x++) {
      sum += array[x];
    }

    System.out.println("Cумма эллементов массива между " + array[0] + " и " + array[array.length - 1] +
            " равна: " + sum);
  }
}
