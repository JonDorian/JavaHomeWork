package com.tms.lesson13.task30;

public class Runner {
  public static void main(String[] args) {
    CollectionOfRandomNumbers list = new CollectionOfRandomNumbers();
    list.setRandomNumbersInList();
    list.printRandomNumbersList();
    list.deleteSameNumbersInList();
    list.printRandomNumbersList();
  }
}