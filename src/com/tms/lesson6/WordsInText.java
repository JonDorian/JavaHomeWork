package com.tms.lesson6;

//Задание №19 из методички №2. Имеется строка с текстом. Подсчитать количество слов в тексте.
//Желательно учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//текста также могут быть пробелы, но могут и отсутствовать.

public class WordsInText {
  public static void main(String[] args) {
    int numOfWords = 0;
    char symbol;
    String text = "  Впереди тяжелые времена, и нам всем придется выбирать между тем, что правильно, и тем, что легко.  ";

    for (int i = 0; i < text.length(); i++) {
      symbol = text.charAt(i);
      if (symbol != ' ' & symbol != '-' & symbol != '.' & symbol != '?') {
        while (i <= text.length()) {
          if (i == text.length()) {
            numOfWords++;
            break;
          } else if (symbol == ' ' | symbol == '-' | symbol == '.') {
            numOfWords++;
            i--;
            break;
          }
          symbol = text.charAt(i++);
        }
      }
    }

    System.out.println(text.length());
    System.out.println("Колличество слов в тексте: " + numOfWords);
  }
}