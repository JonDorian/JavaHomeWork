package com.tms.lesson2;

public class TimePrinter {
  public static void main(String[] args) {
    int s = 1197055;
    int sec = s % 60;
    int m = (s - sec) / 60;
    int min = m % 60;
    int h = (m - min) / 60;
    int hour = h % 24;
    int d = (h - hour) / 24;
    int day = d % 7;
    int w = (d - day) / 7;

    System.out.println(m + " minutes" + " " + sec + " seconds");
    System.out.println(h + " hours " + min + " minutes " + sec + " seconds");
    System.out.println(d + " day(s) " + hour + " hours " + min + " minutes " + sec + " seconds");
    System.out.println(w + " week(s) " + day + " day(s) " + hour + " hours " + min + " minutes " + sec + " seconds");
  }
}
