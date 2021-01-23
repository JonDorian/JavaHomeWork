package com.tms.lesson4.additional;

// Дополнительное задание №7. В переменную записываете количество программистов.
// В зависимости от количества программистов необходимо вывести правильно окончание.
// Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.

public class Task7 {
  public static void main(String[] args) {
    int numOfProg = (int) (Math.random() * 2343);
    String position = null;
    int resiude;
    int resiudeTwo;

    resiude = numOfProg % 10;
    resiudeTwo = numOfProg % 100;

    if (resiudeTwo >= 11 & resiudeTwo <= 20) {
      position = " программистов";
    } else {
      switch (resiude) {
        case 1:
          position = " программист";
          break;
        case 2:
        case 3:
        case 4:
          position = " программиста";
          break;
        case 0:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
          position = " программистов";
          break;
      }
    }

    System.out.println(numOfProg + "" + position);
  }
}
