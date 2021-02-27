package com.tms.lesson10.task26;

public abstract class TV extends Appliances {
  private String screenTechnology;
  private int diagonal;

  public void setScreenTechnology(String screenTechnology) {
    this.screenTechnology = screenTechnology;
  }

  public void setDiagonal(int diagonal) {
    this.diagonal = diagonal;
  }

  public void getScreenTechnology() {
    System.out.println("Технология экрана телевизора " + brand + " - " + screenTechnology);
  }

  public void getDiagonal() {
    System.out.println("Диагональ телевизора " + brand + " равна " + diagonal + " дюйма(ов).");
  }

  public void cannelNetx() {
    System.out.println("Канал переключен на следующий!");
  }

  public void cannelPrev() {
    System.out.println("Канал переключен на пердыдущий!");
  }
}