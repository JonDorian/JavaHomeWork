package com.tms.lesson6;
import java.util.StringTokenizer;

//Задание №19 из методички №2. Имеется строка с текстом. Подсчитать количество слов в тексте.
//Желательно учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//текста также могут быть пробелы, но могут и отсутствовать.

public class WordsInText {
  public static void main(String[] args) {
    int numOfWords = 0;
    String text = "  Впереди тяжелые времена, и нам всем придется выбирать между тем, что правильно, и тем, что легко. ";
    StringTokenizer findWords = new StringTokenizer(text, " -,.;:()!");

    while (findWords.hasMoreTokens()) {
      findWords.nextToken();
      numOfWords++;
    }

    System.out.println("Колличество слов в тексте: " + numOfWords);
  }
}