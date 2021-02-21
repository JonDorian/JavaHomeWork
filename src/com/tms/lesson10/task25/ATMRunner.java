package com.tms.lesson10.task25;

public class ATMRunner {
  public static void main(String[] args) {
    ATM userTry = new ATM(5, 5, 2);
    userTry.getTotalMoney();
    userTry.addMoney(20);
    userTry.addMoney(195);
    userTry.addMoney(30);
    userTry.addMoney(210);
    userTry.addMoney(430);
    userTry.getTotalMoney();
    userTry.cashWithdrawal(330);
    userTry.getResult();
    userTry.getTotalMoney();
    userTry.cashWithdrawal(900000);
    userTry.getResult();
    userTry.getTotalMoney();
    userTry.cashWithdrawal(110);
    userTry.getResult();
    userTry.getTotalMoney();
    userTry.cashWithdrawal(50);
    userTry.getResult();
    userTry.getTotalMoney();
    userTry.cashWithdrawal(100);
    userTry.getResult();
    userTry.getTotalMoney();
    userTry.cashWithdrawal(130);
    userTry.getResult();
    userTry.getTotalMoney();
  }
}