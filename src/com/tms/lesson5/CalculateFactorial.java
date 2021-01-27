package com.tms.lesson5;

// Задание 10 из методички. Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

public class CalculateFactorial {
  public static void main(String[] args) {
    int number = 10;
    int factorial = number;

    for (int i = 1; i <=5; i++) {
      System.out.println("Действие в проходе цикла №: " + i);
      System.out.println("Число " + factorial + " умножаем на " + (++number));
      factorial = factorial * number;
    }

    System.out.println("Факториал от 10 до 15 равен: " + factorial);
  }
}
