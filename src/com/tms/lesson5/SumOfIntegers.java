package com.tms.lesson5;
import java.util.Scanner;

//Задание № 12 из методички. Найдите сумму первых n целых чисел, которые делятся на 3.

public class SumOfIntegers {
  public static void main(String[] args) {
    int sum = 0;
    int counter = 0;
    boolean runFind = true;

    System.out.println("Укажите какое количество чисел делящихся на 3 Вы хотите найти:");
    Scanner choiceQuantity = new Scanner(System.in);
    int quantityOfNumbers = choiceQuantity.nextInt();

    System.out.println("Укажите c какого числа желайте начать поиск:");
    Scanner number = new Scanner(System.in);
    int numberStart = number.nextInt();

    while (runFind) {
      if (numberStart % 3 == 0) {
        System.out.println("Число " + numberStart + " делится на 3");
        sum += numberStart;
        counter++;
      }
      if (counter == quantityOfNumbers) {
        System.out.println("Сумма " + quantityOfNumbers + " первых целых чисел делящихся на 3 равна: " + sum);
        break;
      }
      numberStart++;
    }
  }
}