package com.tms.lesson15.additional.task2;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Дополнительное задание №2. Текстовый файл содержит текст. После запуска программы в другой файл должны
//записаться только те предложения в которых от 3-х до 5-ти слов. Если в предложении присутствует
//слово-палиндром, то не имеет значения какое кол-во слов в предложении, оно попадает в новый файл.

public class Runner {
  public static void main(String[] args) {
    FileReader fr;
    FileWriter fw;
    StringBuffer sentence;
    List<StringBuffer> sentenceList;

    try {
      fr = new FileReader("src/com/tms/lesson15/additional/task2/defaultText.txt");
      sentenceList = new ArrayList<>();
      int tempVal = fr.read();

      while (tempVal != -1) {
        sentence = new StringBuffer();

        while (tempVal != 33 && tempVal != 46 && tempVal != 59 && tempVal != 63 && tempVal != -1) {
          sentence.append((char) tempVal);
          tempVal = fr.read();
        }

        int tempNumOfWords = TextFormatter.getNumberOfWords(sentence.toString());
        boolean tempHavePalindromes = TextFormatter.checkPalindromes(sentence.toString());

        if ((tempNumOfWords >= 3 && tempNumOfWords <= 5) || tempHavePalindromes) {
          sentenceList.add(sentence);
        }
        tempVal = fr.read();
      }
      fr.close();

      if (!sentenceList.isEmpty()) {
        fw = new FileWriter("src/com/tms/lesson15/additional/task2/newFileText.txt", true);
        for (StringBuffer stringBuffer : sentenceList) {
          fw.write(stringBuffer.toString().trim() + ".\n");
        }
        fw.close();
        System.out.println("Новый файл создан и содержит подходящие по ТЗ предложения! Проверьте файл \"newFileText.txt\"!");
      } else {
        System.out.println("Подходящих по ТЗ предложений в исодном файле не обнаружено!");
      }

    } catch (FileNotFoundException e) {
      System.out.println("Файл по указанному пути не найден!");
    } catch (IOException exception) {
      System.out.println("Не удалось прочитать/записать файл!");
    }
  }
}