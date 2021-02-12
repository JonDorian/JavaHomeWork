package com.tms.lesson10.aditionals.human.clothes.shoes;

public class Sandals implements IShoes {
  @Override
  public void putOn() {
    System.out.println("Сандали одеты");
  }

  @Override
  public void takeOff() {
    System.out.println("Сандали сняты");
  }
}