package com.tms.lesson10.task26;

public abstract class WashingMachines extends Appliances {
  private int loadingVolume;
  private int powerInWats;

  public void setLoadingVolume(int loadingVolume) {
    this.loadingVolume = loadingVolume;
  }

  public void setPowerInWatts(int powerInWats) {
    this.powerInWats = powerInWats;
  }

  public void getLoadingVolume() {
    System.out.println("Максимальная загрузка стиральной машины " + brand + " - " + loadingVolume + "кг");
  }

  public void getPowerInWatts() {
    System.out.println("Мощность " + brand + " - " + powerInWats + "Вт");
  }

  public void spinningLinen(){
    System.out.println(name + " " + brand + " начала адский отжим белья");
  }
}
