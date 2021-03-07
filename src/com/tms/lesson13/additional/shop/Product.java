package com.tms.lesson13.additional.shop;

//Создать класс Товар, поля:
//•name(строка)
//•id(целое число)
//•price(целое число)

public class Product {
  private String name;
  private int id;
  private int price;

  Product() {
    setId((int) (Math.random() * 10 + 1));
    setName("Чипсы");
    setPrice((int) (Math.random() * 8 + 1));
  }

  Product(String name, int id, int price) {
    setName(name);
    setId(id);
    setPrice(price);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }
}