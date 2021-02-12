package com.tms.lesson10.aditionals.human;

import com.tms.lesson10.aditionals.human.clothes.jackets.*;
import com.tms.lesson10.aditionals.human.clothes.pants.*;
import com.tms.lesson10.aditionals.human.clothes.shoes.*;

public class HumanRunner {
  public static void main(String[] args) {
    Parka parka = new Parka();
    SportJacket sportJacket = new SportJacket();
    Windbreaker windbreaker = new Windbreaker();

    Jeans jeans = new Jeans();
    SportTrousers sportTrousers = new SportTrousers();
    Trousers trousers = new Trousers();

    Sandals sandals = new Sandals();
    Slippers slippers = new Slippers();
    Sneakers sneakers = new Sneakers();

    Human anton = new Human("Антошка", parka, jeans, sneakers);
    Human denis = new Human("Денис", sportJacket, trousers, sandals);
    Human carapuchel = new Human("Карапучел", windbreaker, sportTrousers, slippers);

    anton.actionPutOnAll();
    denis.actionPutOnAll();
    carapuchel.actionPutOnAll();

    carapuchel.actionTakeOffAll();
  }
}