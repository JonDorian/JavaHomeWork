package com.tms.lesson10.aditionals.human.clothes.shoes;

public class Sneakers implements IShoes {
  @Override
  public void putOn() {
    System.out.println("Кроссовки одеты");
  }

  @Override
  public void takeOff() {
    System.out.println("Кроссовки сняты");
  }
}