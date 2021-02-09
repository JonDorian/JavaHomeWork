package com.tms.lesson6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задание №23 из методички №2. Написать программу, выполняющую поиск в строке всех тегов абзацев,
// в т.ч. тех, у которых есть параметры, например <p id=”p1”>, и замену их на простые теги абзацев <p>.

public class ParagraphSearch {
  public static void main(String[] args) {
    StringBuilder text = new StringBuilder("<p id=”p1”>Lorem ipsum dolor sit amet, <p dsfsdf123>consectetur adipiscing elit</p>, sed do eiusmod tempor incididunt\n" +
            "ut labore et dolore magna aliqua</p>.<p id=”p1”>Ut enim ad minim veniam, quis nostrud exercitation ullamco\n" +
            "laboris nisi ut aliquip ex ea <p sadasdas>commodo</p> consequat.</p>Duis aute irure dolor in reprehenderit in voluptate\n" +
            "elit esse cillum dolore eu <p id=”p1” dfdsfsdcfc  dsfsfe32 >fugiat nulla pariatur.</p> eur sint occaecat cupidatat\n" +
            "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.< p id=”p1”>");

    Pattern pat = Pattern.compile("<\\s?p.*?>");
    Matcher match = pat.matcher(text);

    while (match.find()) {
      if (match.end() == text.length()) {
        text.replace(match.start(), match.end(), "<p>");
        break;
      }
      text.replace(match.start(), match.end(), "<p>");
    }

    System.out.println(text);
  }
}