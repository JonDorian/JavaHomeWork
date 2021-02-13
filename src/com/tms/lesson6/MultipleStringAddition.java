package com.tms.lesson6;

//Задание №21 из методички №2. Напишите три цикла выполняющих многократное сложение строк, один с помощью
//оператора сложения и String, другой с помощью StringBuilder и метода append, а также аналогино
//для StringBuffer. Сравните скорость их выполнения.

public class MultipleStringAddition {
  public static void main(String[] args) {
    String textOne = "Ну, как говориться - синица не ворон, жимолость не синтипон ";
    StringBuilder textTwo = new StringBuilder("Ну, как говориться - синица не ворон, жимолость не синтипон ");
    StringBuffer textThree = new StringBuffer("Ну, как говориться - синица не ворон, жимолость не синтипон ");

    long startTimeOne = System.currentTimeMillis();
    for (byte i = 0; i < 20; i++) {
      textOne += textOne;
    }
    long finishTimeOne = System.currentTimeMillis();
    long operationTimeOne = finishTimeOne - startTimeOne;

    long startTimeTwo = System.currentTimeMillis();
    for (byte i = 0; i < 20; i++) {
      textTwo.append(textTwo);
    }
    long finishTimeTwo = System.currentTimeMillis();
    long operationTimeTwo = finishTimeTwo - startTimeTwo;

    long startTimeThree = System.currentTimeMillis();
    for (byte i = 0; i < 20; i++) {
      textThree.append(textThree);
    }
    long finishTimeThree = System.currentTimeMillis();
    long operationTimeThree = finishTimeThree - startTimeThree;

    System.out.println("Время обработки цикла конкотенации строк с простым String равно: " + operationTimeOne + " мс");
    System.out.println("Время обработки цикла конкотенации строк с использованием StringBuilder равно: " + operationTimeTwo + " мс");
    System.out.println("Время обработки цикла конкотенации строк с использованием StringBuffer равно: " + operationTimeThree + " мс");
  }
}