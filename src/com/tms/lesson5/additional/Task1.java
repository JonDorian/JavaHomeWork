package com.tms.lesson5.additional;

//Дополнительное задание №1.Начав тренировки, спортсмен в первый день пробежал 10 км.
// Каждыйдень он увеличивал дневную норму на 10% нормы предыдущего дня.
// Какойсуммарный путь пробежит спортсмен за 7 дней?

public class Task1 {
  public static void main(String[] args) {
    float distance = 0;
    float rounding = (float) Math.pow(10, 2);
    float totalDistance = 0;

    for (int i = 1; i < 8; i++) {
      if (i == 1) {
        distance = 10;
      } else {
        distance = (float) Math.ceil((distance + ((distance * 10) / 100)) * rounding) / rounding;
      }
      totalDistance +=distance;
      System.out.print("День: " + i + "й, ");
      System.out.println("расстояние: " + distance + "km");
    }

    System.out.println("Суммарный путь пробежки спортсмена за 7 дней: " + totalDistance + "km");
  }
}
