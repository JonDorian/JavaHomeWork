package com.tms.lesson10.task27;

class SomeCorporateCreditCard extends CorporateCards {
  private float discount;

  SomeCorporateCreditCard() {
    setBankName("AlfaBank");
    setPaymentSystem("MasterCard");
    setType("кредитная");
    setCardHolderName("Anton Lapenko");
    setStatus("Gold");
    setExpiryDate(2, 31);
    setCardNumber(2315);
    setBalance(28423.53);
    setPercentCredit(12.4);
    setDiscount(2.3);
  }

  SomeCorporateCreditCard(String bankName, String paymentSystem, String type,
                          String holderName, String status, int expiryMonth,
                          int expiryYear, int cardNumber, double balance, double percent, double discount) {
    setBankName(bankName);
    setPaymentSystem(paymentSystem);
    setType(type);
    setCardHolderName(holderName);
    setStatus(status);
    setExpiryDate(expiryMonth, expiryYear);
    setCardNumber(cardNumber);
    setBalance(balance);
    setPercentCredit(percent);
    setDiscount(discount);
  }

  public void setDiscount(double discount) {
    this.discount = (float) discount;
  }

  public float getDiscount() {
    return discount;
  }

  @Override
  public void getFullInfoByCard() {
    super.getFullInfoByCard();
    System.out.println("Скидка на любые товары в магазинах-партнерах: " + getDiscount() + "%");
  }
}