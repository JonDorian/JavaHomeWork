package com.tms.lesson6;

//Задание №20 из методички №2. Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.

public class LastLetters {
  public static void main(String[] args) {
    String text = "Мнеп зар этуи. разработкув - такуюе премиюе дадут!!!";
    String lastLetterText = "";
    char symbol;

    for (int i = 0; i < text.length(); i++) {
      symbol = text.charAt(i);
      if (symbol != ' ' && symbol != '-' && symbol != '.' && symbol != '?' && symbol != '!') {
        while (i <= text.length()) {
          if (i == text.length()) {
            lastLetterText += Character.toString(text.charAt(i - 2));
            break;
          } else if (symbol == ' ' || symbol == '-' || symbol == '.' || symbol == '?' || symbol == '!') {
            lastLetterText += Character.toString(text.charAt(i - 2));
            break;
          }
          symbol = text.charAt(i++);
        }
      }
    }
    System.out.print(lastLetterText);
  }
}
