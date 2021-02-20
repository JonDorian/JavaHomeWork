package com.tms.lesson11.computer;

public class ComputerRunner {
  public static void main(String[] args) {
    Computer gaming = new Computer();
    Computer.ComputerInfo compOne = gaming.new ComputerInfo();
    Computer office = new Computer("офисный");
    Computer.ComputerInfo compTwo = office.new ComputerInfo("Windows 7", "Intel Core i-3",
            2.4, 3.5, "DDR3", 4);
    Computer.ComputerInfo compThree = office.new ComputerInfo("Windows XP", "Intel Pentium Gold",
            2, 2, "DDR3", 2);

    compOne.getFullInfo();
    compTwo.getFullInfo();
    compThree.getFullInfo();
  }
}