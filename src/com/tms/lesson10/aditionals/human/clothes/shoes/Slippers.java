package com.tms.lesson10.aditionals.human.clothes.shoes;

public class Slippers implements IShoes {
  @Override
  public void putOn() {
    System.out.println("Тапочки одеты");
  }

  @Override
  public void takeOff() {
    System.out.println("Тапочки сняты");
  }
}