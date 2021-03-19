package com.tms.lesson15.additional.task1;
import java.io.*;

//Дополнительное задание №1. В исходном файле находятся слова, каждое слово на новой стороке. После
//запуска программы должен создать файл, который будет содержать в себе только полиндромы.

public class RunnerOnlyPalindromes {
  public static void main(String[] args) throws IOException {
    BufferedReader br = null;
    BufferedWriter bw = null;

    try {
      br = new BufferedReader(new FileReader("src/com/tms/lesson15/additional/task1/defaultText.txt"));
      bw = new BufferedWriter(new FileWriter("src/com/tms/lesson15/additional/task1/onlyPalindromesText.txt"));
      String tempStingOne = br.readLine();
      String tempStringTwo;

      while (tempStingOne != null) {
        tempStringTwo = reverseWord(tempStingOne);
        if (tempStingOne.equals(tempStringTwo)) {
          bw.write(tempStingOne + " ");
        }
        tempStingOne = br.readLine();
      }

      System.out.println("Файл состоящий только из слов-палиндромов создан! Проверьте его!");
    } catch (FileNotFoundException e) {
      System.out.println("По указанному пути нет искомого файла!");
    } finally {
      assert bw != null;
      bw.close();
      br.close();
    }
  }

  public static String reverseWord(String word) {
    return new StringBuffer(word).reverse().toString();
  }
}