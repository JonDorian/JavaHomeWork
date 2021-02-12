package com.tms.lesson10.aditionals.human;

import com.tms.lesson10.aditionals.human.clothes.jackets.IJacket;
import com.tms.lesson10.aditionals.human.clothes.pants.IPants;
import com.tms.lesson10.aditionals.human.clothes.shoes.IShoes;

public class Human implements IHuman {
  private String name;
  private IJacket jacket;
  private IPants pants;
  private IShoes shoes;

  public Human() {
  }

  public Human(String name, IJacket jacket, IPants pants, IShoes shoes) {
    this.name = name;
    this.jacket = jacket;
    this.pants = pants;
    this.shoes = shoes;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setJacket(IJacket jacket) {
    this.jacket = jacket;
  }

  public IJacket getJacket() {
    return jacket;
  }

  public void setPants(IPants pants) {
    this.pants = pants;
  }

  public IPants getPants() {
    return pants;
  }

  public void setShoes(IShoes shoes) {
    this.shoes = shoes;
  }

  public IShoes getShoes() {
    return shoes;
  }

  @Override
  public void actionPutOnAll() {
    System.out.println(getName() + " начинает что-то мутить!");
    jacket.putOn();
    pants.putOn();
    shoes.putOn();
    System.out.println();
  }

  @Override
  public void actionTakeOffAll() {
    System.out.println(getName() + " походу поехал крышей, прямо в магазине:");
    jacket.takeOff();
    pants.takeOff();
    shoes.takeOff();
    System.out.println();
  }
}
