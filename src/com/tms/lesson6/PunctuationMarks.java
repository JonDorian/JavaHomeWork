package com.tms.lesson6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задание №18 из методички №2. Найти в строке не только запятые, но и другие знаки препинания.
//Подсчитать общее их количество.

public class PunctuationMarks {
  public static void main(String[] args) {
    byte dots = 0;
    byte commas = 0;
    byte dash = 0;
    byte questions = 0;
    byte space = 0;
    byte semicolon = 0;
    byte colon = 0;
    byte parentheses = 0;
    byte exclamationMark = 0;
    byte sumOfPunctuationMarks = 0;
    String littleText = "Если в мире все бессмысленно?- сказала Алиса, - что мешает выдумать какой-нибудь смысл?";

    Pattern pat = Pattern.compile("(\\pP)|\\s");
    Matcher match = pat.matcher(littleText);

    while (match.find()) {
      switch (match.group()) {
        case ",":
          commas++;
          break;
        case ".":
          dots++;
          break;
        case "-":
          dash++;
          break;
        case "?":
          questions++;
          break;
        case " ":
          space++;
          break;
        case ";":
          semicolon++;
          break;
        case ":":
          colon++;
          break;
        case ")":
        case "(":
          parentheses++;
          break;
        case "!":
          exclamationMark++;
          break;
      }
      sumOfPunctuationMarks++;
    }

    System.out.println("Колличество запятых: " + commas);
    System.out.println("Колличество точек с запятой: " + semicolon);
    System.out.println("Колличество точек: " + dots);
    System.out.println("Колличество двоеточий: " + colon);
    System.out.println("Колличество тере: " + dash);
    System.out.println("Колличество скобок: " + parentheses);
    System.out.println("Колличество пробелов: " + space);
    System.out.println("Колличество восклицательных знаков: " + exclamationMark);
    System.out.println("Колличество вопросительных знаков: " + questions);
    System.out.print("Общее колличество знаков припинания: " + sumOfPunctuationMarks);
  }
}