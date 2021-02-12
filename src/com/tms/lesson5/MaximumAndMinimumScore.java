package com.tms.lesson5;

// Задание №14 из методички. Создать массив оценок произвольной длины, вывести максимальную и
//минимальную оценку, её (их) номера.

public class MaximumAndMinimumScore {
  public static void main(String[] args) {
    byte[] scoreList = new byte[10];
    byte minValue = 0;
    byte minValueIndex = 0;
    byte maxValue = 0;
    byte maxValueIndex = 0;
    boolean firstPass = true;

    System.out.print("Исходеый список оценок: ");

    for (int i = 0; i < scoreList.length; i++) {
      scoreList[i] = (byte) (Math.random() * 20);
      System.out.print(scoreList[i] + " ");
    }

    System.out.println(" ");

    for (byte one = 0; one < scoreList.length; one++) {
      if (minValue == 0 & firstPass) {
        minValue = scoreList[one];
        firstPass = false;
      }
      if (minValue > scoreList[one]) {
        minValue = scoreList[one];
        minValueIndex = one;
      }
      if (maxValue < scoreList[one]) {
        maxValue = scoreList[one];
        maxValueIndex = one;
      }
    }

    System.out.println("Минимальная оценка в списке: " + minValue + " под индексом " + minValueIndex);
    System.out.println("Максимальная оценка в списке: " + maxValue + " под индексом " + maxValueIndex);
  }
}
