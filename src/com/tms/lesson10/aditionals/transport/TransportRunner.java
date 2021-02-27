package com.tms.lesson10.aditionals.transport;

public class TransportRunner {
  public static void main(String[] args) {
    PassengerCar audi = new PassengerCar();
    FreightTransport scania = new FreightTransport();
    CivilAviation boeing = new CivilAviation();
    MilitaryAviation raptor = new MilitaryAviation();

    audi.getFullInfo();
    audi.getMileageData(3.6);

    scania.getFullInfo();
    scania.getWillTheLoadFit(30.4);


    boeing.getFullInfo();
    boeing.getBoardingControl(180);

    raptor.getFullInfo();
    raptor.rocketShot();
    raptor.rocketShot();
    raptor.rocketShot();
    raptor.goEjection();
  }
}