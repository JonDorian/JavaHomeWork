package com.tms.lesson10.aditionals.transport;

public abstract class Transport {
  private String vehicleType;
  private String brand;
  private int power;
  private int maximalSpeed;
  private int weight;

  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  public String getVehicleType() {
    return vehicleType;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getBrand() {
    return brand;
  }

  public void setPower(int power) {
    this.power = power;
  }

  public int getPower() {
    return power;
  }

  public void setMaximalSpeed(int maximalSpeed) {
    this.maximalSpeed = maximalSpeed;
  }

  public int getMaximalSpeed() {
    return maximalSpeed;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getWeight() {
    return weight;
  }

  public void getFullInfo() {
    System.out.println("Тип техники: " + getVehicleType() + "\nМарка\\модель: " + getBrand() + "\nМошность: "
            + getPower() + "л.с \nМаксимальная скорость: " + getMaximalSpeed() + "км/ч \nВес: "
            + getWeight() + "кг\nМощность в кВт: " + getPowerInKw() + "кВт");
  }

  public float getPowerInKw() {
    return 0.74f * power;
  }
}