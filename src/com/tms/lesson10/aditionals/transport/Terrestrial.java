package com.tms.lesson10.aditionals.transport;

public abstract class Terrestrial extends Transport {
  private int numberOfWheels;
  private float fuelConsumption;

  public void setNumberOfWheels(int numberOfWheels) {
    this.numberOfWheels = numberOfWheels;
  }

  public int getNumberOfWheels() {
    return numberOfWheels;
  }

  public void setFuelConsumption(double fuelConsumption) {
    this.fuelConsumption = (float) fuelConsumption;
  }

  public float getFuelConsumption() {
    return fuelConsumption;
  }

  @Override
  public void getFullInfo() {
    super.getFullInfo();
    System.out.println("Количество колес: " + getNumberOfWheels() + "шт\nРасход топлива на 100км: " + getFuelConsumption() + "л");
  }
}