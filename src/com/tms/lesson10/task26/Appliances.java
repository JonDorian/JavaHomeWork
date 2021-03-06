package com.tms.lesson10.task26;

//Задание №26 из методички №2. Создать иерархию классов, описывающих бытовую технику. Создать несколько
//объектов описанных классов, часть из них включить в розетку. Иерархия должна иметь хотя бы три уровня.

public abstract class Appliances {
  public String color;
  public String name;
  public String brand;
  boolean turnOn = false;

  public void powerOn() {
    if (!turnOn) {
      System.out.println(color + " " + name + " " + brand + " включен(а)! и работает отлично!!!");
    } else {
      System.out.println("Чувак! " + name + " " + brand + " уже включен!!");
    }
    turnOn = true;
  }

  public void powerOf() {
    if (turnOn) {
      System.out.println(color + " " + name + " " + brand + " выключен(а)! и соседи больше не жалуются на его громкую работу!");
    } else {
      System.out.println("Чувак! " + name + " " + brand + " и так выключен!!");
    }
    turnOn = false;
  }
}
