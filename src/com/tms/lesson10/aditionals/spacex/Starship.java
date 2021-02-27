package com.tms.lesson10.aditionals.spacex;

public class Starship implements IStart {
  @Override
  public boolean prelaunchSystemCheck() {
    System.out.println("Идет провека всех систем корбля Starship!");
    int randomNumber = (int) (Math.random() * 10 + 1);
    return randomNumber > 3;
  }

  @Override
  public void engineStart() {
    System.out.println("Двигатели Starship запущены! Все системы в норме!");
  }

  @Override
  public void launch() {
    System.out.println("Старт корабля Starship! that's unreal!!!");
  }
}