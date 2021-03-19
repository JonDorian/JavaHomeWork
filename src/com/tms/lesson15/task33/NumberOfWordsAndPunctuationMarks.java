package com.tms.lesson15.task33;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Задание №33 из методички №3. Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.

public class NumberOfWordsAndPunctuationMarks {
  public static void main(String[] args) throws IOException {
    int numOfWords = 0;
    int numOfPunctuationMarks = 0;
    int currentSymbol;
    String someText = "Ну, как говориться - синица не ворон, жимолость не синтипон!";
    FileOutputStream fos = new FileOutputStream("src/com/tms/lesson15/task33/textFile.txt");

    fos.write(someText.getBytes());
    fos.close();

    FileInputStream fis = new FileInputStream("src/com/tms/lesson15/task33/textFile.txt");

    while ((currentSymbol = fis.read()) != -1) {
      if (currentSymbol >= 32 && currentSymbol <= 47 || currentSymbol >= 58 && currentSymbol <= 63) {
        numOfPunctuationMarks++;
      } else {
        while (fis.read() != -1) {
          currentSymbol = fis.read();
          if (currentSymbol >= 32 && currentSymbol <= 47 || currentSymbol >= 58 && currentSymbol <= 63) {
            numOfPunctuationMarks++;
            numOfWords++;
            break;
          }
        }
      }
    }

    fis.close();

    System.out.println("Количество знаков припинания: " + numOfPunctuationMarks);
    System.out.println("Количество слов в тексте: " + numOfWords);
  }
}