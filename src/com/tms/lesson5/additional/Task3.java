package com.tms.lesson5.additional;

//Дополнительное задание №3. Вычислить: 1+2+4+8+...+256.

public class Task3 {
  public static void main(String[] args) {
    int pow = 2;
    int sum = 0;
    int number = 1;

    System.out.print("Цифры(числа), которые будем складывать: ");

    for (int i = 0; i <= 8; i++) {
      if (i != 0) {
        number *= pow;
      }
      sum += number;
      System.out.print(number + " ");
    }

    System.out.println();
    System.out.println("Их сумма равна: " + sum);
  }
}