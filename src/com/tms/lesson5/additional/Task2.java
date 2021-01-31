package com.tms.lesson5.additional;

//Дополнительное задание №2. Одноклеточная амеба каждые 3 часа делится на 2 клетки.
//Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

public class Task2 {
  public static void main(String[] args) {
    int amoeba = 1;
    int hour;

    for (int i = 3; i <= 24; i += 3) {
      amoeba *= 2;
      hour = i;
      System.out.print("Часов: " + hour + ", ");
      System.out.println("колиество амеб: " + amoeba);
    }
  }
}
