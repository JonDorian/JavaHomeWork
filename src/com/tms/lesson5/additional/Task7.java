package com.tms.lesson5.additional;

//Дополнительное задание №7. Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99.

public class Task7 {
  public static void main(String[] args) {
    int sum = 0;

    for (int i = 1; i < 100; i+=2) {
        sum +=i;
    }

    System.out.println("Сумма нечетных чисел от 1 до 99 равна: " + sum);
  }
}
