package com.tms.lesson10.aditionals.robot.legs;

public class SamsungLeg implements ILeg {
  private int price;

  public SamsungLeg() {
  }

  public SamsungLeg(int price) {
    this.price = price;
  }

  @Override
  public void step() {
    System.out.println("Ноги Samsung делают шаги");
  }

  @Override
  public int getPrice() {
    return price;
  }
}