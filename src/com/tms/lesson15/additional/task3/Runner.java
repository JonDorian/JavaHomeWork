package com.tms.lesson15.additional.task3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

//Дополнительное задание №3.
//Проверка на цензуру:
//Создаете 2 файла.
//1 - й. Содержит исходный текст.
//2 - й. Содержит слова недопустимые в тексте(black list). Структура файла определите сами, хотите каждое слово
//на новой строке, хотите через запятую разделяйте, ваша программа делайте как считаете нужным.
//Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не встретилось ни одного недопустимого слова,
//то выводите сообщение о том что текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее сообщение,
//кол-во предложений не прошедших проверку и сами предложения подлежащие исправлению.


public class Runner {
  public static void main(String[] args) {
    FileReader frDefaultText;
    BufferedReader bfBadWords;
    List<String> sentencesList;
    List<String> badWordsList;
    List<String> sentencesWithBadWordsList;

    try {
      frDefaultText = new FileReader("src/com/tms/lesson15/additional/task3/defaultText.txt");
      bfBadWords = new BufferedReader(new FileReader("src/com/tms/lesson15/additional/task3/badWordsList.txt"));

      sentencesList = TextChecker.getAllSentencesList(frDefaultText);
      badWordsList = TextChecker.getBadWordsList(bfBadWords);
      frDefaultText.close();
      bfBadWords.close();
      sentencesWithBadWordsList = TextChecker.checkSentences(sentencesList, badWordsList);

      if (!sentencesWithBadWordsList.isEmpty()) {
        TextChecker.getCountOfSentencesWithBadWords();
        int numeration = 1;
        for (String sentence : sentencesWithBadWordsList) {
          System.out.println(numeration + " - " + sentence);
          numeration++;
        }
      } else {
        System.out.println("Текст прошел проверку на цензуру и готов к печати!");
      }

    } catch (FileNotFoundException e) {
      System.out.println("По указаному пути файл не найден! проверьте путь к файлу!");
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}