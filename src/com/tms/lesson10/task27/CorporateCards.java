package com.tms.lesson10.task27;

public abstract class CorporateCards extends CreditCards {
  public void getCorporateCapabilities() {
    System.out.println(getCardHolderName() + " а кредитка-то корпорпативная, и процентная ставка херня, всего " + getPercentCredit() + " можешь даже не возвращать!");
    System.out.println();
  }
}