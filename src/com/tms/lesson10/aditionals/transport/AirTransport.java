package com.tms.lesson10.aditionals.transport;

public abstract class AirTransport extends Transport {
  private float wingspan;
  private int minimumLengthRunwayStrip;

  public void setWingspan(double wingspan) {
    this.wingspan = (float) wingspan;
  }

  public float getWingspan() {
    return wingspan;
  }

  public void setMinimumLengthRunwayStrip(int minimumLengthRunwayStrip) {
    this.minimumLengthRunwayStrip = minimumLengthRunwayStrip;
  }

  public int getMinimumLengthRunwayStrip() {
    return minimumLengthRunwayStrip;
  }

  @Override
  public void getFullInfo() {
    super.getFullInfo();
    System.out.println("Размах крыльев: " + getWingspan() + "\nМинимальная длинна взлетно-посадочной полосы для взлета: "
            + getMinimumLengthRunwayStrip() + "км");
  }
}