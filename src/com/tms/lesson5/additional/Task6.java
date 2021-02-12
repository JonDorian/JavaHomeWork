package com.tms.lesson5.additional;

// Дополнительное задание №6. Напишите программу вывода всех четных чисел от 2 до 100 включительно.

public class Task6 {
  public static void main(String[] args) {
    System.out.println("Четные числа от 2 до 100 включительно: ");
    for (int i = 2; i <= 100; i+=2) {
        System.out.print(i + " ");
    }
  }
}
