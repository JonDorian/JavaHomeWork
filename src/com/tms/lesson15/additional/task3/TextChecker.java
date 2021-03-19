package com.tms.lesson15.additional.task3;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TextChecker {
  private static int countOfSentencesWithBadWords = 0;

  public static void getCountOfSentencesWithBadWords() {
    System.out.println("Количество предложений подлежащих исправлению: " + countOfSentencesWithBadWords);
  }

  public static List<String> getAllSentencesList(FileReader fr) throws IOException {
    List<String> sentenceList = new ArrayList<>();
    StringBuffer sentence;
    int temp = fr.read();
    while (temp != -1) {
      sentence = new StringBuffer();
      while (temp != 33 && temp != 46 && temp != 59 && temp != 63 && temp != -1) {
        sentence.append((char) temp);
        temp = fr.read();
      }
      sentenceList.add(sentence.append(".").toString().trim());
      temp = fr.read();
    }
    return sentenceList;
  }

  public static List<String> getBadWordsList(BufferedReader br) throws IOException {
    List<String> badWordsList = new ArrayList<>();
    String tempString = br.readLine();

    while (tempString != null) {
      badWordsList.add(tempString);
      tempString = br.readLine();
    }
    return badWordsList;
  }

  public static List<String> checkSentences(List<String> defaultSentencesList, List<String> badWords) {
    List<String> sentenceWithBadWords = new ArrayList<>();
    for (String badWord : badWords) {
      for (String sentence : defaultSentencesList) {
        String tempStringTwo;
        StringTokenizer findWords = new StringTokenizer(sentence, " -,.;:()!?");
        while (findWords.hasMoreTokens()) {
          tempStringTwo = findWords.nextToken();
          if (badWord.equals(tempStringTwo)) {
            sentenceWithBadWords.add(sentence);
            countOfSentencesWithBadWords++;
          }
        }
      }
    }
    return sentenceWithBadWords;
  }
}