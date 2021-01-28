package com.tms.lesson5;

//Задание 13 из методички. Создать последовательность случайных чисел, найти и вывести наибольшее из них.

public class LargerRandomNumber {
  public static void main(String[] args) {
    int[] array = new int[10];

    System.out.print("Исходеый массив чисел: ");

    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 20);
      System.out.print(array[i] + " ");
    }

    System.out.println(" ");

    for (int one = 0; one < 1; one++) {
      for (int two = 0; two < array.length - 1 - one; two++) {
        if (array[two] > array[two + 1]) {
          int temp = array[two];
          array[two] = array[two + 1];
          array[two + 1] = temp;
        }
      }
    }

    System.out.println("Наибольшее число в массиве: " + array[array.length - 1]);
  }
}
