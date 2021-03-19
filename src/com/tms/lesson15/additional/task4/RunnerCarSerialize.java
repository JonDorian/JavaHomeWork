package com.tms.lesson15.additional.task4;
import java.io.*;

//Дополнительное задание №4. Сеарилизовать объект Автомобиль(Марка, скорость, цена).
//После сериализации произвести обратный процесс

public class RunnerCarSerialize {
  public static void main(String[] args) {
    Car ford = new Car("Mustang", 250, 32000);
    ford.getFullInfoByCar();

    try {
      FileOutputStream fos = new FileOutputStream(new File("src/com/tms/lesson15/additional/task4/carSerialize.dat"));
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(ford);
      oos.close();
      fos.close();

      FileInputStream fis = new FileInputStream("src/com/tms/lesson15/additional/task4/carSerialize.dat");
      ObjectInputStream ois = new ObjectInputStream(fis);

      Car someCar = (Car) ois.readObject();
      someCar.getFullInfoByCar();

      fis.close();
      ois.close();

    } catch (IOException | ClassNotFoundException e) {
      System.out.println("Возникла ошибка!");
      e.printStackTrace();
    }
  }
}