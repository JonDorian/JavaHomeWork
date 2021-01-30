package com.tms.lesson5;

// Задание 17 из методички. Создать двухмерный квадратный массив, и заполнить его «бабочкой».

public class Butterfly {
  public static void main(String[] args) {
    String[][] array = new String[5][5];
    int average = array.length / 2;

    for (int i = 0; i <= average; i++) {
      for (int j = 0; j < i + 1; j++) {
        array[i][j] = "*";
      }
    }

    for (int i = average; i < array.length; i++) {
      for (int j = average - (i / 2); j > -1; j--) {
        array[i][j] = "*";
      }
    }

    for (int i = 0; i < average+1; i++) {
      for (int j = array.length-1; j > average+1-i; j--) {
        array[i][j] = "*";
      }
    }

    for (int i = array.length - 1; i > average - 1; i--) {
      for (int j = array.length - 1; j > i - 1; j--) {
        array[i][j] = "*";
      }
    }

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (array[i][j] == null) {
          array[i][j] = "-";
        }
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}
