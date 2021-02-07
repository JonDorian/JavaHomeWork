package com.tms.lesson6;

//Задание №23 из методички №2. Написать программу, выполняющую поиск в строке всех тегов абзацев,
// в т.ч. тех, у которых есть параметры, например <p id=”p1”>, и замену их на простые теги абзацев <p>.

public class ParagraphSearch {
  public static void main(String[] args) {
    String text = "<p id=”p1”>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt\n " +
            "ut labore et dolore magna aliqua</p>.<p id=”p1”>Ut enim ad minim veniam, quis nostrud exercitation ullamco\n " +
            "laboris nisi ut aliquip ex ea commodo consequat.</p>Duis aute irure dolor in reprehenderit in voluptate\n " +
            "velit esse cillum dolore eu <p id=”p1”>fugiat nulla pariatur.</p> <p id=”p1”>Excepteur sint occaecat cupidatat\n " +
            "non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.<p>";

    text = text.replaceAll("<p(\\s(id)?\\s?=\\s?\\W\\S+\\W)?>", "<p>");

    System.out.print(text);
  }
}