package com.tms.lesson10.task26;

public class SomeWashingMachine extends WashingMachines {
  private boolean delayedStart;

  public SomeWashingMachine() {
    name = "стиральная машина";
    brand = "Indesit";
    color = "белая";
    setLoadingVolume(6);
    setPowerInWatts(2000);
    delayedStart = false;
  }

  public SomeWashingMachine(String brand, String color, int loadingVolume, int powerInWatts, boolean delayedStart) {
    name = "стиральная машина";
    this.brand = brand;
    this.color = color;
    setLoadingVolume(loadingVolume);
    setPowerInWatts(powerInWatts);
    setDelayedStart(delayedStart);
  }

  public void setDelayedStart(boolean delayedStart) {
    this.delayedStart = delayedStart;
  }

  public void getDelayedStart(){
    System.out.println("Наличие режима отложенного запуска стирки: " + delayedStart);
  }
}
