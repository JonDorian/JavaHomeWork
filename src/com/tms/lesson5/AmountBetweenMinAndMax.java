package com.tms.lesson5;

// Задание 16 из методички. Определите сумму элементов одномерного массива, расположенных между
//минимальным и максимальным значениями.

public class AmountBetweenMinAndMax {
  public static void main(String[] args) {
    int[] array = new int[10];
    byte minValue = 0;
    byte minValueIndex = 0;
    byte maxValue = 0;
    byte maxValueIndex = 0;
    boolean firstPass = true;
    int sum = 0;

    System.out.print("Исходный массив: ");
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 20);
      System.out.print(array[i] + " ");
    }

    System.out.println(" ");

    for (byte one = 0; one < array.length; one++) {
      if (minValue == 0 & firstPass) {
        minValue = (byte) array[one];
        firstPass = false;
      }
      if (minValue > array[one]) {
        minValue = (byte) array[one];
        minValueIndex = one;
      }
      if (maxValue < array[one]) {
        maxValue = (byte) array[one];
        maxValueIndex = one;
      }
    }

    System.out.println("Минимальное значение массива: " + minValue + " под индексом " + minValueIndex);
    System.out.println("Максимальное значение массива: " + maxValue + " под индексом " + maxValueIndex);

    if (minValueIndex < maxValueIndex) {
      for (byte i = minValueIndex; i < maxValueIndex - 1; i++) {
        sum += array[i + 1];
      }
      System.out.println("Cумма эллементов массива между " + array[minValueIndex] + " и " + array[maxValueIndex] + " равна: " + sum);
    } else {
      for (byte i = maxValueIndex; i < minValueIndex - 1; i++) {
        sum += array[i + 1];
      }
      System.out.println("Cумма эллементов массива между " + array[maxValueIndex] + " и " + array[minValueIndex] + " равна: " + sum);
    }
  }
}