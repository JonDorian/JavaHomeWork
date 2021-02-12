package com.tms.lesson10.task27;

public class SomeDebitCard extends DebitCards {
  public SomeDebitCard() {
    setBankName("RRB");
    setPaymentSystem("Visa");
    setType("дебетовая");
    setCardHolderName("Валислий Светлов");
    setStatus("Silver");
    setExpiryDate(2, 25);
    setCardNumber(6345);
    setBalance(7864.66);
  }

  public SomeDebitCard(String bankName, String paymentSystem,
                       String holderName, String status, int expiryMonth,
                       int expiryYear, int cardNumber, double balance) {
    setBankName(bankName);
    setPaymentSystem(paymentSystem);
    setType("дебетовая");
    setCardHolderName(holderName);
    setStatus(status);
    setExpiryDate(expiryMonth, expiryYear);
    setCardNumber(cardNumber);
    setBalance(balance);
  }
}