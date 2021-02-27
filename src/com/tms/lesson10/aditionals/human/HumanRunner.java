package com.tms.lesson10.aditionals.human;

import com.tms.lesson10.aditionals.human.clothes.jackets.*;
import com.tms.lesson10.aditionals.human.clothes.pants.*;
import com.tms.lesson10.aditionals.human.clothes.shoes.*;

public class HumanRunner {
  public static void main(String[] args) {
    IJacket sportJacket = new SportJacket();
    IJacket parka = new Parka();
    IJacket windbreaker = new Windbreaker();

    IPants jeans = new Jeans();
    IPants sportTrousers = new SportTrousers();
    IPants trousers = new Trousers();

    IShoes sandals = new Sandals();
    IShoes slippers = new Slippers();
    IShoes sneakers = new Sneakers();

    Human anton = new Human("Антошка", parka, jeans, sneakers);
    Human denis = new Human("Денис", sportJacket, trousers, sandals);
    Human carapuchel = new Human("Карапучел", windbreaker, sportTrousers, slippers);

    anton.actionPutOnAll();
    denis.actionPutOnAll();
    carapuchel.actionPutOnAll();

    carapuchel.actionTakeOffAll();
  }
}