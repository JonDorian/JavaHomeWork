package com.tms.lesson10.task26;

public class SomeTV extends TV {
  public SomeTV() {
    name = "телевизор";
    brand = "LG";
    color = "черный";
    setScreenTechnology("IPS");
    setDiagonal(55);
  }

  public SomeTV(String brand, String color, String technology, int diagonal) {
    name = "телевизор";
    this.brand = brand;
    this.color = color;
    setScreenTechnology(technology);
    setDiagonal(diagonal);
  }
}