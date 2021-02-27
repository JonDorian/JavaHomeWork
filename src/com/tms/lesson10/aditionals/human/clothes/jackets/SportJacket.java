package com.tms.lesson10.aditionals.human.clothes.jackets;

public class SportJacket implements IJacket {
  @Override
  public void putOn() {
    System.out.println("Спортивная куртка одета");
  }

  @Override
  public void takeOff() {
    System.out.println("Спортивная куртка снята");
  }
}