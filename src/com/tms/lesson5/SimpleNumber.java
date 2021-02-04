package com.tms.lesson5;

// Задание 11 из методички. Имеется целое число, определить является ли это число простым, т.е.
//делится без остатка только на 1 и себя.

public class SimpleNumber {
  public static void main(String[] args) {
    int number = (int) (Math.random() * 999 + 1);
    boolean isSimple = true;

    for (int i = 2; i < number / i; i++) {
      if (number % i == 0) {
        isSimple = false;
        break;
      }
    }

    if (isSimple) {
      System.out.println("Число " + number + " является простым");
    } else {
      System.out.println("Число " + number + " не является простым");
    }
  }
}
