package com.tms.lesson4.additional;
import java.util.Random;

// Дополнительное задание №6. Даны 2 числа. Вывести большее из них.

public class Task6 {
  public static void main(String[] args) {
    Random numberX = new Random();
    int numberOne = numberX.nextInt();
    int numberTwo = numberX.nextInt();

    if (numberOne > numberTwo) {
      System.out.println(numberOne);
    } else {
      System.out.println(numberTwo);
    }
  }
}
