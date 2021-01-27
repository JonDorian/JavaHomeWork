package com.tms.lesson5;

//Задание № 12 из методички. Найдите сумму первых n целых чисел, которые делятся на 3.

public class SumOfIntegers {
  public static void main(String[] args) {
    int sum = 0;
    int counter = 0;

    for (int i = 1; i < 50; i++) {
      if (i % 3 == 0) {
        System.out.println("Число " + i + " делится на 3");
        sum += i;
        counter++;
      }
      if (counter == 2) {
        System.out.println("Сумма первых целых чисел делящихся на 3 равна: " + sum);
        break;
      }
    }
  }
}
