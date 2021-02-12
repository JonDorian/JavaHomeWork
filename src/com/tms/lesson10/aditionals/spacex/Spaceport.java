package com.tms.lesson10.aditionals.spacex;

public class Spaceport {
  public static void main(String[] args) throws InterruptedException {
    Starship starship = new Starship();
    SpaceShuttle spaceShuttle = new SpaceShuttle();

    Spaceport.launchRocket(starship);
    Spaceport.launchRocket(spaceShuttle);
  }

  public static void launchRocket(IStart rocket) throws InterruptedException {
    if (rocket.prelaunchSystemCheck()) {
      System.out.println("Предстаротвая проверка прошла успешно!!!");
      rocket.engineStart();
      int i = 10;
      while (i > 0) {
        System.out.print(i + " ");
        i--;
        Thread.sleep(350);
      }
      System.out.println();
      rocket.launch();
      System.out.println("В центре управления полетами NASA массовая оргия!!!!");
    } else {
      System.out.println("Предстартовая проверка завершилась неудачей! В центре управления полетами NASA массовая драка! ");
    }
    System.out.println();
  }
}
