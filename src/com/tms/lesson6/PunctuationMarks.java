package com.tms.lesson6;

//Задание №18 из методички №2. Найти в строке не только запятые, но и другие знаки препинания.
//Подсчитать общее их количество.

public class PunctuationMarks {
  public static void main(String[] args) {
    byte dots = 0;
    byte commas = 0;
    byte dash = 0;
    byte questions = 0;
    byte sumOfPunctuationMarks = 0;
    char symbol;
    String littleText = "Привет. Если в мире все бессмысленно, - сказала Алиса, - что мешает выдумать какой-нибудь смысл?";

    for (int i = 0; i < littleText.length(); i++) {
      symbol = littleText.charAt(i);
      if (symbol == ',' || symbol == '-' || symbol == '.' || symbol == '?') {
        if (symbol == ',') {
          commas++;
        } else if (symbol == '.') {
          dots++;
        } else if (symbol == '-') {
          dash++;
        } else if (symbol == '?') {
          questions++;
        }
        sumOfPunctuationMarks++;
      }
    }

    System.out.println("Колличество запятых: " + commas);
    System.out.println("Колличество точек: " + dots);
    System.out.println("Колличество тере: " + dash);
    System.out.println("Колличество вопросительных знаков: " + questions);
    System.out.print("Общее колличество знаков припинания: " + sumOfPunctuationMarks);
  }
}