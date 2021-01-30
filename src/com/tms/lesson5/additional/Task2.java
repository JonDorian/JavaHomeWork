package com.tms.lesson5.additional;

//Дополнительное задание №2. Одноклеточная амеба каждые 3 часа делится на 2 клетки.
//Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

public class Task2 {
  public static void main(String[] args) {
    int amoуba = 1;
    int hour = 1;

    for (int i = 1; i <=24; i++) {
      if(i % 3 == 0) {
        if (i == 3) {
          amoуba = 2;
          hour = i;
        } else {
          hour = i;
          amoуba *=3;
        }
        System.out.print("Часов: " + hour + ", ");
        System.out.println("колиество амеб: " + amoуba);
      }
    }
  }
}
