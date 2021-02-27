package com.tms.lesson10.aditionals.human.clothes.pants;

public class Trousers implements IPants {
  @Override
  public void putOn() {
    System.out.println("Брюки одеты");
  }

  @Override
  public void takeOff() {
    System.out.println("Брюки сняты");
  }
}