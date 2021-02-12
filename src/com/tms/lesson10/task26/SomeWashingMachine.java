package com.tms.lesson10.task26;

public class SomeWashingMachine extends WashingMachines {

  public SomeWashingMachine() {
    name = "стиральная машина";
    brand = "Indesit";
    color = "белая";
    setLoadingVolume(6);
    setPowerInWatts(2000);
  }

  public SomeWashingMachine(String brand, String color, int loadingVolume, int powerInWatts) {
    name = "стиральная машина";
    this.brand = brand;
    this.color = color;
    setLoadingVolume(loadingVolume);
    setPowerInWatts(powerInWatts);
  }
}
