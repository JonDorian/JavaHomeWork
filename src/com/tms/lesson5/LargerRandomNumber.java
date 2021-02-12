package com.tms.lesson5;

//Задание 13 из методички. Создать последовательность случайных чисел, найти и вывести наибольшее из них.

public class LargerRandomNumber {
  public static void main(String[] args) {
    byte[] array = new byte[10];
    byte maxValue = 0;
    byte maxValueIndex = 0;

    System.out.print("Исходеый массив чисел: ");

    for (int i = 0; i < array.length; i++) {
      array[i] = (byte) (Math.random() * 20);
      System.out.print(array[i] + " ");
    }

    System.out.println(" ");

    for (byte one = 0; one < array.length; one++) {
      if (maxValue < array[one]) {
        maxValue = array[one];
        maxValueIndex = one;
      }
    }

    System.out.println("Наибольшее число в массиве: " + maxValue + " под индексом: " + maxValueIndex);
  }
}
