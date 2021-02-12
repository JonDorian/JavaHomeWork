package com.tms.lesson10.task27;

public abstract class CreditCards extends BankCards {
  private String type = "кредитная";
  private String percentCredit;

  public void setPercentCredit(double percent) {
    percentCredit = percent + "%";
  }

  public String getPercentCredit() {
    return percentCredit;
  }

  @Override
  public void getFullInfoByCard() {
    super.getFullInfoByCard();
    System.out.println("процентная ставка: " + getPercentCredit());
  }
}