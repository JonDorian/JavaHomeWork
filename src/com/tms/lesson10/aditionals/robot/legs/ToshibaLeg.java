package com.tms.lesson10.aditionals.robot.legs;

public class ToshibaLeg implements ILeg {
  private int price;

  public ToshibaLeg() {
  }

  public ToshibaLeg(int price) {
    this.price = price;
  }

  @Override
  public void step() {
    System.out.println("Ноги Toshiba делают шаги");
  }

  @Override
  public int getPrice() {
    return price;
  }
}