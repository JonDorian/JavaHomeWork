package com.tms.lesson10.aditionals.human.clothes.pants;

public class Jeans implements IPants {
  @Override
  public void putOn() {
    System.out.println("Джинсы одеты");
  }

  @Override
  public void takeOff() {
    System.out.println("Джинсы сняты");
  }
}