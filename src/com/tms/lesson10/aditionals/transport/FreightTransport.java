package com.tms.lesson10.aditionals.transport;

public class FreightTransport extends Terrestrial {
  private float liftingCapacity;

  public void setLiftingCapacity(double liftingCapacity) {
    this.liftingCapacity = (float) liftingCapacity;
  }

  public float getLiftingCapacity() {
    return liftingCapacity;
  }

  public FreightTransport() {
    setVehicleType("фура");
    setBrand("Scania");
    setPower(450);
    setMaximalSpeed(160);
    setWeight(6500);
    setNumberOfWheels(12);
    setFuelConsumption(42.3);
    setLiftingCapacity(32.5);
  }

  public FreightTransport(String vehicleType, String brand, int power, int maximalSpeed, int weight, int numberOfWheels, double fuelConsumption, int liftingCapacity) {
    setVehicleType(vehicleType);
    setBrand(brand);
    setPower(power);
    setMaximalSpeed(maximalSpeed);
    setWeight(weight);
    setNumberOfWheels(numberOfWheels);
    setFuelConsumption(fuelConsumption);
    setLiftingCapacity(liftingCapacity);
  }

  @Override
  public void getFullInfo() {
    super.getFullInfo();
    System.out.println("Грузоподъемность: " + getLiftingCapacity() + "т");
    System.out.println();
  }

  public void getWillTheLoadFit(double cargo) {
    if (cargo < getLiftingCapacity()) {
      System.out.println(getVehicleType() + " " + getBrand() + " заргужен(а) на " + cargo + "т, можно отправляться в путь!");
    } else {
      System.out.println("Груз объемом " + cargo + "т. слишком велик, " + getVehicleType() + " необходим(а) большей вместимости!");
    }
    System.out.println();
  }
}