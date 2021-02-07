package com.tms.lesson6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задание №20 из методички №2. Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.

public class LastLetters {
  public static void main(String[] args) {
    String text = "Я уже неделю на работу хожу и не разу еще туда не пришел!";
    StringBuilder lastLetterText = new StringBuilder();

    Pattern pat = Pattern.compile("\\w\\b", Pattern.UNICODE_CHARACTER_CLASS);
    Matcher match = pat.matcher(text);

    while (match.find()) {
      lastLetterText.append(match.group());
    }

    System.out.println(lastLetterText);
  }
}