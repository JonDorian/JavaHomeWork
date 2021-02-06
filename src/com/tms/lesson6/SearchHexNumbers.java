package com.tms.lesson6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задание №22 из методички №2. Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
//записаных по правилам Java, с помощью регулярных выражений и вывести их на страницу.

public class SearchHexNumbers {
  public static void main(String[] args) {
    String text = "Привет. Если 0x2f в мире 0x45Aff все бессмысленно, 0xF4 - сказала Алиса.";
    String reg = "0[Xx](([a-fA-F]|[0-9]){0,2}){1,3}";
    Pattern pat = Pattern.compile(reg);
    Matcher match = pat.matcher(text);

    while (match.find()) {
      System.out.print(match.group() + " ");
    }
  }
}
