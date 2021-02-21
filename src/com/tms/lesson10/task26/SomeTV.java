package com.tms.lesson10.task26;

public class SomeTV extends TV {
  private boolean voiceControl;

  public SomeTV() {
    name = "телевизор";
    brand = "LG";
    color = "черный";
    setScreenTechnology("IPS");
    setDiagonal(55);
    voiceControl = false;
  }

  public SomeTV(String brand, String color, String technology, int diagonal, boolean voiceControl) {
    name = "телевизор";
    this.brand = brand;
    this.color = color;
    setScreenTechnology(technology);
    setDiagonal(diagonal);
    setVoiceControl(voiceControl);
  }

  public void setVoiceControl(boolean voiceControl) {
    this.voiceControl = voiceControl;
  }
  public void getVoiceControl(){
    System.out.println("Наличие голосового управления: " + voiceControl);
  }
}