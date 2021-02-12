package com.tms.lesson10.task27;

public abstract class DebitCards extends BankCards {
  public void getInforming() {
    System.out.println("Баланс карты " + getPaymentSystem() + " " + getStatus() + " от банка " + getBankName() + " на текущий момент составляет: " + getBalance());
  }
}