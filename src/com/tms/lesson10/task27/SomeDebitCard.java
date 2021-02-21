package com.tms.lesson10.task27;

public class SomeDebitCard extends DebitCards {
  private int withdrawalLimit;

  public SomeDebitCard() {
    setBankName("RRB");
    setPaymentSystem("Visa");
    setType("дебетовая");
    setCardHolderName("Валислий Светлов");
    setStatus("Silver");
    setExpiryDate(2, 25);
    setCardNumber(6345);
    setSmsInforming(true);
    setBalance(7864.66);
    setWithdrawalLimit(2500);
  }

  public SomeDebitCard(String bankName, String paymentSystem,
                       String holderName, String status, int expiryMonth,
                       int expiryYear, int cardNumber, double balance, int withdrawalLimit, boolean smsInforming) {
    setBankName(bankName);
    setPaymentSystem(paymentSystem);
    setType("дебетовая");
    setCardHolderName(holderName);
    setStatus(status);
    setExpiryDate(expiryMonth, expiryYear);
    setCardNumber(cardNumber);
    setBalance(balance);
    setWithdrawalLimit(withdrawalLimit);
    setSmsInforming(smsInforming);
  }

  public void setWithdrawalLimit(int withdrawalLimit) {
    this.withdrawalLimit = withdrawalLimit;
  }

  public int getWithdrawalLimit() {
    return withdrawalLimit;
  }

  @Override
  public void getFullInfoByCard() {
    super.getFullInfoByCard();
    System.out.println("Лимит на снятие денежных средств в банках-партнерах: " + getWithdrawalLimit() + " $/мес");
  }
}