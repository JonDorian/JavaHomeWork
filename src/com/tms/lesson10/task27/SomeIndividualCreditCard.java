package com.tms.lesson10.task27;

public class SomeIndividualCreditCard extends IndividualCards {
  public SomeIndividualCreditCard() {
    setBankName("BPS");
    setPaymentSystem("Maestro");
    setType("кредитная");
    setCardHolderName("Timofey Perdun");
    setStatus("Standard");
    setExpiryDate(9, 28);
    setCardNumber(8546);
    setBalance(67343.44);
    setPercentCredit(28.9);
  }

  public SomeIndividualCreditCard(String bankName, String paymentSystem,
                                  String holderName, String status, int expiryMonth,
                                  int expiryYear, int cardNumber, double balance, double percent) {
    setBankName(bankName);
    setPaymentSystem(paymentSystem);
    setType("кредитная");
    setCardHolderName(holderName);
    setStatus(status);
    setExpiryDate(expiryMonth, expiryYear);
    setCardNumber(cardNumber);
    setBalance(balance);
    setPercentCredit(percent);
  }
}