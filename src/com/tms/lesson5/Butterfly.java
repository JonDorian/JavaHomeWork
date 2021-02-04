package com.tms.lesson5;

// Задание 17 из методички. Создать двухмерный квадратный массив, и заполнить его «бабочкой».

public class Butterfly {
  public static void main(String[] args) {
    char[][] array = new char[9][9];

    for (int i = 0; i < array.length / 2 + 1; i++) {
      for (int j = i; j < array.length - i; j++) {
        array[i][j] = '1';
      }
    }

    for (int i = array.length - 1; i > array.length / 2 - 1; i--) {
      for (int j = i; j > array.length - i - 2; j--) {
        array[i][j] = '1';
      }
    }

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (array[i][j] == '\0') {
          array[i][j] = ' ';
        }
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}
