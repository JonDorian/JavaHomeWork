package com.tms.lesson4;
import java.util.Random;

// Задание 8 из методички. Имеется целове число (задать с помощью Random rand = new Random(); int x =
//rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//нему слово «рублей» в правильном падеже

public class CorrectCases {
  public static void main(String[] args) {
    Random rand = new Random();
    int x = rand.nextInt();
    String ruble = null;
    int resiude;
    int resiudeTwo;

    if (x < 0) { // перевод отрицательного числа в положительное (для отрицательных слишком раздутый switch) хотя можно)))
      x = -x;
    }

    resiude = x % 10;
    resiudeTwo = x % 100;

    if (resiudeTwo >= 11 & resiudeTwo <= 20) {
      ruble = " рублей";
    } else {
      switch (resiude) {
        case 1:
          ruble = " рубль";
          break;
        case 2:
        case 3:
        case 4:
          ruble = " рубля";
          break;
        case 0:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
          ruble = " рублей";
          break;
      }
    }

    System.out.println(x + "" + ruble);
  }
}
