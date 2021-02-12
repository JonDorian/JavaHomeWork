package com.tms.lesson10.aditionals.transport;

public class CivilAviation extends Air {
  private int numberOfPassengerSeats;
  boolean businessClass;

  public void setNumberOFPassengerSeats(int numberOfPassengerSeats) {
    this.numberOfPassengerSeats = numberOfPassengerSeats;
  }

  public int getNumberOfPassengerSeats() {
    return numberOfPassengerSeats;
  }

  public void setBusinessClass(boolean businessClass) {
    this.businessClass = businessClass;
  }

  public boolean getBusinessClass() {
    return businessClass;
  }

  public CivilAviation() {
    setVehicleType("пассажирский самолет");
    setBrand("Boeing 747");
    setPower(2400);
    setMaximalSpeed(950);
    setWeight(150000);
    setWingspan(68.5);
    setMinimumLengthRunwayStrip(3);
    setNumberOFPassengerSeats(220);
    setBusinessClass(true);
  }

  public CivilAviation(String brand, int power, int maximalSpeed, int weight, double wingspan,
                       int runwayStrip, int numberOfSeats, boolean businessClass) {
    setVehicleType("пассажирский самолет");
    setBrand(brand);
    setPower(power);
    setMaximalSpeed(maximalSpeed);
    setWeight(weight);
    setWingspan(wingspan);
    setMinimumLengthRunwayStrip(runwayStrip);
    setNumberOFPassengerSeats(numberOfSeats);
    setBusinessClass(businessClass);
  }

  @Override
  public void getFullInfo() {
    super.getFullInfo();
    System.out.println("Количество пассажирских мест: " + getNumberOfPassengerSeats() +
            "шт\nНаличе бизнес-класса: " + getBusinessClass());
    System.out.println();
  }

  public void getBoardingControl(int numberOfPassenger) {
    if (numberOfPassenger < getNumberOfPassengerSeats()) {
      System.out.println("На " + getVehicleType() + " " + getBrand() + " посадочный контроль прошли " + numberOfPassenger +
              " человек, мест хватило на всех, можно отправляться в путь!");
    } else {
      System.out.println("Количество пассажиров " + numberOfPassenger + "чел. превышает количество посадочных мест, которых "
              + getNumberOfPassengerSeats() + "шт., требуется" + getVehicleType() + " с большим количеством пассажирских мест!");
    }
    System.out.println();
  }
}