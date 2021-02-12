package com.tms.lesson10.task27;

//Задание №27 из методички №2. Создать иерархию классов, описывающих банковские карточки.
//Иерархия должна иметь хотя бы три уровня.

public abstract class BankCards {
  private String bankName;
  private String paymentSystem;
  private String status;
  private String cardHolderName;
  private String expiryDate;
  private String cardNumber;
  private String type;
  private float balance;

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public String getBankName() {
    return bankName;
  }

  public void setPaymentSystem(String paymentSystem) {
    this.paymentSystem = paymentSystem;
  }

  public String getPaymentSystem() {
    return paymentSystem;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }

  public String getCardHolderName() {
    return cardHolderName;
  }

  public void setCardNumber(int number) {
    cardNumber = number + " " + number + " " + number + " " + number;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public void setExpiryDate(int month, int year) {
    expiryDate = month + "/" + year;
  }

  public String getExpiryDate() {
    return expiryDate;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public void setBalance(double balance) {
    this.balance = (float)balance;
  }

  public float getBalance() {
    return balance;
  }

  public void getFullInfoByCard () {
    System.out.println("Владелец карты: " + getCardHolderName() + "\nбанк: " + getBankName() +
            "\nтип карты: "+ getType() + "\nплатежная система: " + getPaymentSystem() + "\nстатуы карты: "
            + getStatus() + "\nсрок действия карты: " + getExpiryDate() +
            "\nномер карты: " + getCardNumber() + "\nбаланс: " + getBalance()+"$");
  }
}