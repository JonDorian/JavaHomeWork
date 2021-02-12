package com.tms.lesson5;

// Задание №9 из методички. Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
//произведение, т.е. факториал числа.

public class SumToFactorial {
  public static void main(String[] args) {
    double factorial = 1;
    int n = 0;
    int x = (int) (Math.random() * 9 + 1);

    while (x != 0) {
      System.out.println("Рандомное число " + x);
      factorial *= x;
      n++;
      x = (int) (Math.random() * 10);
    }

    System.out.println("Факториал равен: " + factorial);
    System.out.println("Колличество проходов цикла: " + n);
  }
}
