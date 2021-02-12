package com.tms.lesson10.aditionals.robot.hands;

public class SonyHand implements IHand {
  private int price;

  public SonyHand() {
  }

  public SonyHand(int price) {
    this.price = price;
  }

  @Override
  public void upHand() {
    System.out.println("Поднимаются руки Sony");
  }

  @Override
  public int getPrice() {
    return price;
  }
}