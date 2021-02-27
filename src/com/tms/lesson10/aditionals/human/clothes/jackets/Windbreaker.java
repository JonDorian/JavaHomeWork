package com.tms.lesson10.aditionals.human.clothes.jackets;

public class Windbreaker implements IJacket{
  @Override
  public void putOn() {
    System.out.println("Ветровка одета");
  }

  @Override
  public void takeOff() {
    System.out.println("Ветровка снята");
  }
}
