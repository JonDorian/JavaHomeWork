package com.tms.lesson11.city;

public class CityRunner {
  public static void main(String[] args) {
    City cityOne = new City();
    City.Info streetOne = cityOne.new Info();
    City.Info streetTwo = cityOne.new Info("проспект", "Независимости", 2005, 15.3);
    City cityTwo = new City("Москва");
    City.Info streetThree = cityTwo.new Info("проспект", "Ленинградский", 1957, 14);

    streetOne.getFullInfo();
    streetTwo.getFullInfo();
    streetThree.getFullInfo();
  }
}