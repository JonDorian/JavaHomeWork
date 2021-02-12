package com.tms.lesson10.task27;

public abstract class IndividualCards extends CreditCards {
  public void getIndividualCapabilities() {
    System.out.println(getCardHolderName() + " а кредитка-то индивидуальная, и процент по кредиту тебе лютый - " + getPercentCredit() + ", больше не ввязывайся в это дерьмо!");
    System.out.println();
  }
}