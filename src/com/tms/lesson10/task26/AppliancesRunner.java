package com.tms.lesson10.task26;

public class AppliancesRunner {
  public static void main(String[] args) {
    SomeTV lg = new SomeTV();
    SomeTV samsung = new SomeTV("samsung", "серебристый", "IPS", 43);
    SomeWashingMachine indesit = new SomeWashingMachine();
    SomeWashingMachine bosh = new SomeWashingMachine("Bosh", "красная", 4, 1600);

    lg.getDiagonal();
    lg.getScreenTechnology();
    lg.powerOn();
    lg.cannelNetx();
    lg.cannelPrev();
    lg.powerOn();
    lg.powerOf();

    System.out.println();

    samsung.getScreenTechnology();
    samsung.getDiagonal();
    samsung.powerOn();
    samsung.cannelNetx();
    samsung.cannelPrev();
    samsung.powerOf();
    samsung.powerOf();

    System.out.println();

    bosh.powerOn();
    bosh.getPowerInWatts();
    bosh.getLoadingVolume();
    bosh.spinningLinen();
    bosh.powerOf();

    System.out.println();

    indesit.powerOn();
    indesit.getPowerInWatts();
    indesit.getLoadingVolume();
    indesit.spinningLinen();
    indesit.powerOf();
  }
}
