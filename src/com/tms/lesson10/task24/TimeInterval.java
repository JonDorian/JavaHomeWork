package com.tms.lesson10.task24;

//Задание №24 из методички №2. Создать класс и объекты описывающие промежуток времени. Сам промежуток в классе должен
//задаваться тремя свойствами: секундами, минутами, часами. Сделать методы для получения полного количества секунд в
//объекте, сравнения двух объектов (метод должен работать аналогично compareTo в строках). Создать два конструктора:
//получающий общее количество секунд, и часы, минуты и секунды по отдельности. Сделать метод для вывода данных.

public class TimeInterval {
  private int seconds;
  private int minutes;
  private int hours;
  private int totalSeconds;

  TimeInterval(int totalSeconds) {
    this.totalSeconds = totalSeconds;
    seconds = totalSeconds % 60;
    int min = (totalSeconds - seconds) / 60;
    minutes = min % 60;
    hours = (min - minutes) / 60;
  }

  TimeInterval(int hours, int minutes, int seconds) {
    int sec = seconds;
    seconds = sec % 60;
    int min = (sec - seconds) / 60 + minutes;
    minutes = min % 60;
    int h = hours;
    hours = (min - minutes) / 60 + h;

    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
    this.totalSeconds = seconds + (minutes * 60) + ((hours * 60) * 60);
  }

  public void printTimeInterval() {
    System.out.println("Total seconds: " + getTotalSeconds());
    System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");
  }

  public int getTotalSeconds() {
    return totalSeconds;
  }

  public void compareTimeIntervals(TimeInterval obj) {
    if (totalSeconds == obj.totalSeconds) {
      System.out.println("Интервалы времени равны!");
    } else {
      System.out.println("Интервалы времени не равны!");
    }
  }
}