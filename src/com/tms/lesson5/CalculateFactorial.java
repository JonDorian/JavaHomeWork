package com.tms.lesson5;

// Задание 10 из методички. Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

public class CalculateFactorial {
  public static void main(String[] args) {
    int number = (int) (Math.random() * 6 + 10);
    int factorial = 1;

    for (int i = 1; i <= number; i++) {
      System.out.println("Действие в проходе цикла №: " + i);
      System.out.println("Число " + factorial + " умножаем на " + i);
      factorial = factorial * i;
    }

    System.out.println("Факториал числа " + number + " равен: " + factorial);
  }
}
