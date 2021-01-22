package com.tms.lesson4;
//Задание 6 из методички. Создайте число. Определите, является ли число трехзначным. Определите, является
//ли его последняя цифра семеркой. Определите, является ли число четным.
public class NumberInfo {
  public static void main(String[] args) {
    int number = 347;

    if (number > 99 & number <= 999) {
      System.out.println("Число " + number + " является трехзначным!");
    } else {
      System.out.println("Да хз \"сколькозначное\" это число =)");
    }

    if (number % 10 == 7) {
      System.out.println("Последняя цифра чилса " + number + " равняется семи!");
    }

    if (number % 2 == 0) {
      System.out.println("Число " + number + " является четным!");
    } else {
      System.out.println("Число " + number + " нечетное");
    }
  }
}
