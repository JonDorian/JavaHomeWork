package com.tms.lesson13.task30;
import java.util.ArrayList;
import java.util.List;

//Задание №30 из методички №3. Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.

public class CollectionOfRandomNumbers {
  private final List<Integer> randomNumbersList = new ArrayList<>();

  public void setRandomNumbersInList() {
    int randomNumber = (int) (Math.random() * 30);
    for (int i = 0; i < randomNumber; i++) {
      int rand = (int) (Math.random() * 10);
      randomNumbersList.add(i, rand);
    }
    System.out.println("Коллекция заполнена рандомными числами!");
  }

  public void printRandomNumbersList() {
    for (int x : randomNumbersList) {
      System.out.print(x + " ");
    }
    System.out.println();
  }

  public void deleteSameNumbersInList() {
    for (int i = 0; i < randomNumbersList.size(); i++) {
      for (int j = i; j < randomNumbersList.size() - 1; j++) {
        if (randomNumbersList.get(i).equals(randomNumbersList.get(j + 1))) {
          randomNumbersList.remove(j + 1);
          j--;
        }
      }
    }
    System.out.println("Элементы с одинаковыми значениями удалены!");
  }
}