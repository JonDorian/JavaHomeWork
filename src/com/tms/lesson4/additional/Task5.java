package com.tms.lesson4.additional;
import java.util.Random;
// Дополнительное задание №5. Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
public class Task5 {
  public static void main(String[] args) {
    Random numberX = new Random();
    int numberOne = numberX.nextInt();
    int numberTwo = numberX.nextInt();
    int numberThree = numberX.nextInt();
    int positiveNumbers = 0;
    int negativeNumbers = 0;

    if (numberOne > 0) {
      positiveNumbers++;
    } else {
      negativeNumbers++;
    }
    if (numberTwo > 0) {
      positiveNumbers++;
    } else {
      negativeNumbers++;
    }
    if (numberThree > 0) {
      positiveNumbers++;
    } else {
      negativeNumbers++;
    }

    System.out.println("Перворе число имеет значение: " + numberOne);
    System.out.println("Второе число имеет значение: " + numberTwo);
    System.out.println("Третье число имеет значение: " + numberThree);
    System.out.println("Положительных чисел в исходном наборе: " + positiveNumbers);
    System.out.println("Отрицательных чисел в исходном наборе: " + negativeNumbers);
  }
}
