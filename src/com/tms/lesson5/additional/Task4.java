package com.tms.lesson5.additional;

//Дополнительное задание №4. Составьте программу, вычисляющую A*B, не пользуясь операциейумножения.

public class Task4 {
  public static void main(String[] args) {
    int a = (int) (Math.random() * 9 + 1);
    int b = (int) (Math.random() * 9 + 1);
    int composition = 0;

    System.out.println("Даны число а: " + a + " и число b: " + b);

    for (int i = 0; i < b; i++) {
      composition += a;
    }

    System.out.println("Их произведение равно: " + composition);
  }
}
