package com.tms.lesson4.additional;

// Дополнительное задание №1. В переменную записываем число. Надо вывести на экран сколько в этом
//числе цифр и положительное оно или отрицательное. Например, "это
//однозначное положительное число". Достаточно будет определить, является ли
//число однозначным, "двухзначным или трехзначным и более.

public class Task1 {
  public static void main(String[] args) {
    int number = (int) (Math.random() * 9999 + 1);

    System.out.println("Значение переменной: " + number);
    System.out.print("Это: ");

    if (number >= 0 && number <= 9 || number < 0 && number >= -9) {
      System.out.print("однозначное ");
    } else if (number >= 10 && number <= 99 || number <= -10 && number >= -99) {
      System.out.print("двухзначное ");
    } else if (number >= 100 && number <= 999 || number <= -100 && number >= -999) {
      System.out.print("трехзначное ");
    } else if (number >= 1000 && number <= 9999 || number <= -1000 && number >= -9999) {
      System.out.print("четырехзначное ");
    }

    if (number >= 0) {
      System.out.print("положительное ");
    } else {
      System.out.print("отрицательное ");
    }

    System.out.println("число");
  }
}
