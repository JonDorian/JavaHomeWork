package com.tms.lesson10.task26;

public class AppliancesRunner {
  public static void main(String[] args) {
    SomeTV lg = new SomeTV();
    SomeTV samsung = new SomeTV("samsung", "серебристый", "IPS", 43, true);
    SomeWashingMachine indesit = new SomeWashingMachine();
    SomeWashingMachine bosh = new SomeWashingMachine("Bosh", "красная", 4, 1600, true);

    lg.getDiagonal();
    lg.getScreenTechnology();
    lg.powerOn();
    lg.cannelNetx();
    lg.cannelPrev();
    lg.getVoiceControl();
    lg.powerOn();
    lg.powerOf();


    System.out.println();

    samsung.getScreenTechnology();
    samsung.getDiagonal();
    samsung.powerOn();
    samsung.cannelNetx();
    samsung.cannelPrev();
    samsung.getVoiceControl();
    samsung.powerOf();
    samsung.powerOf();

    System.out.println();

    bosh.powerOn();
    bosh.getPowerInWatts();
    bosh.getLoadingVolume();
    bosh.getDelayedStart();
    bosh.spinningLinen();
    bosh.powerOf();

    System.out.println();

    indesit.powerOn();
    indesit.getPowerInWatts();
    indesit.getLoadingVolume();
    indesit.getDelayedStart();
    indesit.spinningLinen();
    indesit.powerOf();
  }
}
