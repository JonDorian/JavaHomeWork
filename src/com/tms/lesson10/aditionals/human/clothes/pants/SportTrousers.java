package com.tms.lesson10.aditionals.human.clothes.pants;

public class SportTrousers implements IPants {
  @Override
  public void putOn() {
    System.out.println("Спортивные штаны одеты");
  }

  @Override
  public void takeOff() {
    System.out.println("Спортивные штаны сняты");
  }
}