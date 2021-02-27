package com.tms.lesson10.aditionals.human.clothes.jackets;

public class Parka implements IJacket {
  @Override
  public void putOn() {
    System.out.println("Парка одета");
  }

  @Override
  public void takeOff() {
    System.out.println("Парка снята");
  }
}