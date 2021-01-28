package com.tms.lesson5;

//Задание №15 из методички. Создать массив, заполнить его случайными элементами, распечатать, перевернуть,
// и снова распечатать (при переворачивании нежелательно создавать еще один массив)

public class InvertedArray {
  public static void main(String[] args) {
    int[] array = new int[5];

    System.out.print("Исходный массив: ");

    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 20);
      System.out.print(array[i] + " ");
    }

    System.out.println(" ");

    for (int i = 0; i < array.length / 2; i++) {
      int temp = array[i];
      array[i] = array[(array.length - 1) - i];
      array[(array.length - 1) - i] = temp;
    }

    System.out.print("Перевернутый массив: ");
    for (int x : array) {
      System.out.print(x + " ");
    }
  }
}
