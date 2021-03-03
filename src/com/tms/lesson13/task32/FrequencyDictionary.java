package com.tms.lesson13.task32;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

//Задание №32 из методички №3. Имеется текст. Следует составить для него частотный словарь.

public class FrequencyDictionary {
  public String someText = "Как Как Как говорится  говорится, палец не палец, стрекоза не мать! Почешешь - не засмеётся! Я " +
          "восемнадцать лет уже работаю в службах внутренних органов, и все восемнадцать лет ещё такого " +
          "у меня не было, чтобы я начал чего-то делать.";
  LinkedHashMap<String, Integer> dictionary = new LinkedHashMap<>();
  StringTokenizer findWords = new StringTokenizer(someText, " -,.;:()!");

  public void setWordsInDictionary() {
    while (findWords.hasMoreTokens()) {
      String word = findWords.nextToken();
      if (dictionary.containsKey(word)) {
        int tempValue = dictionary.get(word);
        dictionary.put(word, ++tempValue);
      } else {
        dictionary.put(word, 1);
      }
    }
  }

  public void printDictionary() {
    System.out.println(dictionary);
  }
}
