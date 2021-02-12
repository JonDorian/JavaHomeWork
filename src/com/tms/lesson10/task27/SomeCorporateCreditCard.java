package com.tms.lesson10.task27;

class SomeCorporateCreditCard extends CorporateCards {
  SomeCorporateCreditCard() {
    setBankName("AlfaBank");
    setPaymentSystem("MasterCard");
    setType("кредитная");
    setCardHolderName("Anton Lapenko");
    setStatus("Gold");
    setExpiryDate(2, 31);
    setCardNumber(2315);
    setBalance(28423.53);
    this.setPercentCredit(12.4);
  }

  SomeCorporateCreditCard(String bankName, String paymentSystem, String type,
                          String holderName, String status, int expiryMonth,
                          int expiryYear, int cardNumber, double balance, double percent) {
    setBankName(bankName);
    setPaymentSystem(paymentSystem);
    setType(type);
    setCardHolderName(holderName);
    setStatus(status);
    setExpiryDate(expiryMonth, expiryYear);
    setCardNumber(cardNumber);
    setBalance(balance);
    setPercentCredit(percent);
  }
}