package com.tms.lesson10.aditionals.spacex;

public class SpaceShuttle implements IStart {
  @Override
  public boolean prelaunchSystemCheck() {
    System.out.println("Идет провека всех систем корбля SpaceShuttle!");
    int randomNumber = (int) (Math.random() * 10 + 1);
    return randomNumber > 3;
  }

  @Override
  public void engineStart() {
    System.out.println("Двигатели SpaceShuttle запущены! Все системы в норме!");
  }

  @Override
  public void launch() {
    System.out.println("Старт корабля SpaceShuttle! oh my god!!");
  }
}