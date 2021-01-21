package com.tms.lesson3;

public class DefineNumber {
  public static void main(String[] args) {
    int number = 5678;
    int reverseNumber;
    int a, b, c, d;

    a = (number % 10) * 10;
    b = (number % 100) / 10;
    a = (a + b) * 10;
    c = (number % 1000) / 100;
    a = (a + c) * 10;
    d = (number % 10000) / 1000;

    reverseNumber = a + d;

    System.out.print("Если число " + number + " прочесть в обратном порядке, получится " + reverseNumber);

    /*
    System.out.print("Если число " + number + " прочесть в обратном порядке, получится "
            + number % 10 + "" + (number % 100) / 10 + "" + (number % 1000) / 100 + "" + (number % 10000) / 1000);
     */
  }
}
