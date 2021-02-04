package com.tms.lesson5.additional;

//Дополнительное задание №3. Вычислить: 1+2+4+8+...+256.

public class Task3 {
  public static void main(String[] args) {
    int sum = 0;

    System.out.print("Цифры(числа), которые будем складывать: ");

    for (int i = 1; i <= 256; i *= 2) {
      sum += i;
      System.out.print(i + " ");
    }

    System.out.println();
    System.out.println("Их сумма равна: " + sum);
  }
}