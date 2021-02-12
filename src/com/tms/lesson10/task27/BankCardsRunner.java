package com.tms.lesson10.task27;

public class BankCardsRunner {
  public static void main(String[] args) {
    SomeCorporateCreditCard cardOne = new SomeCorporateCreditCard();
    SomeIndividualCreditCard cardTwo = new SomeIndividualCreditCard("BelarusBank", "Maestro", "Tatoshka Petrov",
            "Standard", 12, 26, 7312, 5634.21, 35.4);
    SomeDebitCard cardThree = new SomeDebitCard();

    cardOne.getFullInfoByCard();
    cardOne.getCorporateCapabilities();

    cardTwo.getFullInfoByCard();
    cardTwo.getIndividualCapabilities();

    cardThree.getFullInfoByCard();
    cardThree.getInforming();
  }
}