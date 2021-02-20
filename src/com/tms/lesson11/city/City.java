package com.tms.lesson11.city;

//Книга Блинов/Романчик, задания к Главе 5, Вариант А №8.
//Создать класс City с внутренним классом, с помощью объектов которого можно хранить информацию
//о проспектах, улицах, площадях.

public class City {
  private String cityName;

  City() {
    cityName = "Минск";
  }

  City(String cityName) {
    this.cityName = cityName;
  }

  class Info {
    private String type;
    private String avenueName;
    private int yearOfFoundation;
    private float length;

    Info() {
      this.type = "улица";
      this.avenueName = "Карла Маркса";
      this.yearOfFoundation = 1922;
      this.length = 1.33f;
    }

    Info(String type, String avenueName, int yearOfFoundation, double length) {
      setType(type);
      setAvenueName(avenueName);
      setYearOfFoundation(yearOfFoundation);
      setLength(length);
    }

    public void setType(String type) {
      this.type = type;
    }

    public String getType() {
      return type;
    }

    public void setAvenueName(String avenueName) {
      this.avenueName = avenueName;
    }

    public String getAvenueName() {
      return avenueName;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
      this.yearOfFoundation = yearOfFoundation;
    }

    public int getYearOfFoundation() {
      return yearOfFoundation;
    }

    public void setLength(double length) {
      this.length = (float) length;
    }

    public float getLength() {
      return length;
    }

    public void getFullInfo() {
      System.out.println("Город " + cityName + ", " + getType() + " " + avenueName + ", год основания(именования) - "
              + getYearOfFoundation() + ", протяженность - " + getLength() + "км.");
    }
  }
}