package com.tms.lesson10.aditionals.transport;

public class MilitaryAviation extends AirTransport {
  private boolean ejectionSystem;
  private int numberOfRockets;

  public void setEjectionSystem(boolean ejectionSystem) {
    this.ejectionSystem = ejectionSystem;
  }

  public boolean getEjectionSystem() {
    return ejectionSystem;
  }

  public void setNumberOfRockets(int numberOfRockets) {
    this.numberOfRockets = numberOfRockets;
  }

  public int getNumberOfRockets() {
    return numberOfRockets;
  }

  public MilitaryAviation() {
    setVehicleType("истребитель");
    setBrand("F-22 Raptor");
    setPower(4000);
    setMaximalSpeed(2410);
    setWeight(16000);
    setWingspan(13.56);
    setMinimumLengthRunwayStrip(1);
    setEjectionSystem(true);
    setNumberOfRockets(2);
  }

  public MilitaryAviation(String vehicleType, String brand, int power, int maximalSpeed, int weight,
                          double wingspan, int runwayStrip, boolean ejectionSystem, int numberOfRockets) {
    setVehicleType(vehicleType);
    setBrand(brand);
    setPower(power);
    setMaximalSpeed(maximalSpeed);
    setWeight(weight);
    setWingspan(wingspan);
    setMinimumLengthRunwayStrip(runwayStrip);
    setEjectionSystem(ejectionSystem);
    setNumberOfRockets(numberOfRockets);
  }

  @Override
  public void getFullInfo() {
    super.getFullInfo();
    System.out.println("Система катапультрования: " + getEjectionSystem() +
            "\nКоличество ракет: " + getNumberOfRockets() + "шт");
    System.out.println();
  }

  public void rocketShot() {
    if (getNumberOfRockets() > 0) {
      System.out.println("Ракета пошла!");
      numberOfRockets--;
    } else {
      System.out.println("Ракет больше нет! стреляй с пальца дружок или срочное катапультирование!!!");
    }
  }

  public void goEjection() {
    if (getEjectionSystem()) {
      System.out.println("Катапультирование прошло успешно, позвонки превратились в труху!");
    } else {
      System.out.println("Системы катапультирования нет, но у каждого пилота есть пистолет...");
    }
  }
}