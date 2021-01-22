package com.tms.lesson4;
// Задание 5 из методички. Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?
public class DifferentNumbers {
  public static void main(String[] args) {
    int number = 3961;
    int a = number % 10;
    int b = (number % 100) / 10;
    int c = (number % 1000) / 100;
    int d = (number % 10000) / 1000;

    if (((a != b) & (a != c) & (a != d)) & ((b != c) & (b != d)) & (c != d)) {
      System.out.println("Все цифры числа " + number + " различны!");
    } else {
      System.out.println("Не все цифры числа " + number + " различны(");
    }
  }
}

