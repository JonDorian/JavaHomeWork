package com.tms.lesson15.task34;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Задание №33 из методички №3. Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
//распечатать, посчитать сумму, убрать все повторяющиеся числа и снова распечатать.

public class TextWithNumbers {
  public static void main(String[] args) {
    int sumOfNumbers;
    List<Integer> numbersFromText = new ArrayList<>();
    FileInputStream fis;

    try {
      fis = new FileInputStream("src/com/tms/lesson15/task34/text.txt");
      int temp;
      while ((temp = fis.read()) != -1) {
        if (temp >= 48 && temp <= 57) {
          numbersFromText.add(temp);
        }
      }
      fis.close();

      printArray(numbersFromText);
      sumOfNumbers = calculateSum(numbersFromText);
      System.out.println("Сумма цифр найденных в тексте: " + sumOfNumbers);
      removeDuplicateDigit(numbersFromText);
      printArray(numbersFromText);
      sumOfNumbers = calculateSum(numbersFromText);
      System.out.println("Сумма цифр после удаления повторяющихся: " + sumOfNumbers);

    } catch (FileNotFoundException e) {
      System.out.println("Файл не найден! проверьте путь к файлу!");
    } catch (IOException exception) {
      exception.printStackTrace();
    }
  }

  public static void printArray(List<Integer> list) {
    for (int x : list) {
      System.out.print(Character.getNumericValue(x) + " ");
    }
    System.out.println();
  }

  public static int calculateSum(List<Integer> list) {
    int sum = 0;
    for (int x : list) {
      sum += Character.getNumericValue(x);
    }
    return sum;
  }

  public static void removeDuplicateDigit(List<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i).equals(list.get(j))) {
          list.remove(j);
        }
      }
    }
  }
}