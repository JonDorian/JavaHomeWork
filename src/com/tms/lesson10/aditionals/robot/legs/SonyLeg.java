package com.tms.lesson10.aditionals.robot.legs;

public class SonyLeg implements ILeg{
  private int price;

  public SonyLeg() {
  }

  public SonyLeg(int price) {
    this.price = price;
  }

  @Override
  public void step() {
    System.out.println("Ноги Sony делают шаги");
  }

  @Override
  public int getPrice() {
    return price;
  }
}
