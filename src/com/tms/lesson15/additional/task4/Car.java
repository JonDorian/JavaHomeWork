package com.tms.lesson15.additional.task4;
import java.io.Serializable;

public class Car implements Serializable {
  private static final long serialVersionUID = 54634423411234L;
  private String brand;
  private int speed;
  private int cost;

  Car() {
    setBrand("Ford");
    setSpeed(220);
    setCost(3200);
  }

  Car(String brand, int speed, int cost) {
    this.brand = brand;
    this.speed = speed;
    this.cost = cost;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getBrand() {
    return brand;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getSpeed() {
    return speed;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }

  public int getCost() {
    return cost;
  }

  public void getFullInfoByCar() {
    System.out.println("Марка: " + getBrand() + ", максимальная скорость: " + getSpeed() + ", стоимость: " + getCost());
  }
}