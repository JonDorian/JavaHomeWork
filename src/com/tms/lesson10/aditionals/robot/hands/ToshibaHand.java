package com.tms.lesson10.aditionals.robot.hands;

public class ToshibaHand implements IHand {
  private int price;

  public ToshibaHand() {
  }

  public ToshibaHand(int price) {
    this.price = price;
  }

  @Override
  public void upHand() {
    System.out.println("Поднимаются руки Toshiba");
  }

  @Override
  public int getPrice() {
    return price;
  }
}