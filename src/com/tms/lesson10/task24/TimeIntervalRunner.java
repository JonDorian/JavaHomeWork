package com.tms.lesson10.task24;

public class TimeIntervalRunner {
  public static void main(String[] args) {
    TimeInterval timeOne = new TimeInterval(6485);
    TimeInterval timeTwo = new TimeInterval(1,48,5);

    timeOne.printTimeInterval();
    timeTwo.printTimeInterval();
    timeTwo.compareTimeIntervals(timeOne);
  }
}
