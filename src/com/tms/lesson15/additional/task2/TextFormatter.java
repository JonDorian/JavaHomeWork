package com.tms.lesson15.additional.task2;
import java.util.StringTokenizer;

public class TextFormatter {

  public static int getNumberOfWords(String str) {
    int numberOfWords = 0;
    StringTokenizer findWords = new StringTokenizer(str, " .,!?%1234567890");

    while (findWords.hasMoreTokens()) {
      numberOfWords++;
      findWords.nextToken();
    }

    return numberOfWords;
  }

  public static boolean checkPalindromes(String str) {
    StringTokenizer findPalindromes = new StringTokenizer(str, " ,-");
    String tempStr;
    String tempStrTwo;
    boolean havePalindrome = false;

    while (findPalindromes.hasMoreTokens()) {
      tempStr = findPalindromes.nextToken();
      tempStrTwo = reverseWord(tempStr);
      int numberOfLetters = tempStr.length();

      if (tempStr.equals(tempStrTwo) && numberOfLetters > 1) {
        havePalindrome = true;
      }
    }

    return havePalindrome;
  }

  public static String reverseWord(String word) {
    return new StringBuffer(word).reverse().toString();
  }
}