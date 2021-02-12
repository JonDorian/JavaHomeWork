package com.tms.lesson5.additional;

// Дополнительно задание №5. Напишите программу печати таблицы перевода расстояний из дюймов
// в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см.

public class Task5 {
  public static void main(String[] args) {
    float centimeter = 2.54f;
    String unit;

    for (int i = 1; i <= 20; i++) {
      switch (i) {
        case 1:
          unit = " дюйм";
          break;
        case 2:
        case 3:
        case 4:
          unit = " дюйма";
          break;
        default:
          unit = " дюймов";
      }
      System.out.println(i + unit + " = " + i * centimeter + " см");
    }
  }
}
