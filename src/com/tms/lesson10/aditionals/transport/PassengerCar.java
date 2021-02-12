package com.tms.lesson10.aditionals.transport;

public class PassengerCar extends Terrestrial {
  private String typeBody;
  private int numberOfPassengerSeats;

  public void setTypeBody(String typeBody) {
    this.typeBody = typeBody;
  }

  public String getTypeBody() {
    return typeBody;
  }

  public void setNumberOfPassengerSeats(int numberOfPassengerSeats) {
    this.numberOfPassengerSeats = numberOfPassengerSeats;
  }

  public int getNumberOfPassengerSeats() {
    return numberOfPassengerSeats;
  }

  public PassengerCar() {
    setVehicleType("легковой автомобиль");
    setBrand("Audi A5");
    setPower(250);
    setMaximalSpeed(280);
    setWeight(1300);
    setNumberOfWheels(4);
    setFuelConsumption(11.5);
    setTypeBody("седан");
    setNumberOfPassengerSeats(4);
  }

  public PassengerCar(String vehicleType, String brand, int power, int maximalSpeed, int weight,
                      int numberOfWheels, double fuelConsumption, String typeBody, int numberOfPassengerSeats) {
    setVehicleType(vehicleType);
    setBrand(brand);
    setPower(power);
    setMaximalSpeed(maximalSpeed);
    setWeight(weight);
    setNumberOfWheels(numberOfWheels);
    setFuelConsumption(fuelConsumption);
    setTypeBody(typeBody);
    setNumberOfPassengerSeats(numberOfPassengerSeats);
  }

  @Override
  public void getFullInfo() {
    super.getFullInfo();
    System.out.println("Тип кузова: " + getTypeBody() + "\nКолличество пассажирских мест: " + getNumberOfPassengerSeats() + "шт");
    System.out.println();
  }

  public void getMileageData(double time) {
    float totalDistance = (float) (getMaximalSpeed() * time);
    System.out.println("За время " + time + " часа, " + getVehicleType() + " " + getBrand() + " двигаясь с максимальной скростью "
            + getMaximalSpeed() + "км/ч израсходует " + getFuelConsumptionCalc(totalDistance) + " литров топлива и проедет" +
            " расстояние " + totalDistance + "км.");
    System.out.println();
  }

  private float getFuelConsumptionCalc(float totalDistance) {
    return (totalDistance / 100) * getFuelConsumption();
  }
}