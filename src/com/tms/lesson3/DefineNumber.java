package com.tms.lesson3;

public class DefineNumber {
  public static void main(String[] args) {
    int number = 5678;

    System.out.print("Число " + number + " прочесть в обратном порядке, получится "
            + number % 10 + "" + (number % 100) / 10 + "" + (number % 1000) / 100 + "" + (number % 10000) / 1000);
  }
}
