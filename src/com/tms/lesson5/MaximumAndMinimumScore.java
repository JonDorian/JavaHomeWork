package com.tms.lesson5;

// Задание №14 из методички. Создать массив оценок произвольной длины, вывести максимальную и
//минимальную оценку, её (их) номера.

public class MaximumAndMinimumScore {
  public static void main(String[] args) {
    int[] scoreList = new int[10];

    System.out.print("Исходеый список оценок: ");

    for (int i = 0; i < scoreList.length; i++) {
      scoreList[i] = (int) (Math.random() * 20);
      System.out.print(scoreList[i] + " ");
    }

    System.out.println(" ");

    for (int first = 0; first < scoreList.length - 1; first++) {
      for (int second = 0; second < scoreList.length - first - 1; second++) {
        if (scoreList[second] > scoreList[second + 1]) {
          int temp = scoreList[second];
          scoreList[second] = scoreList[second + 1];
          scoreList[second + 1] = temp;
        }
      }
    }

    System.out.println("Минимальная оценка в списке: " + scoreList[0]);
    System.out.println("Максимальная оценка в списке: " + scoreList[scoreList.length - 1]);
  }
}
