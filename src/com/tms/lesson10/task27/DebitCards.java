package com.tms.lesson10.task27;

public abstract class DebitCards extends BankCards {
  private boolean smsInforming;

 public void setSmsInforming(boolean smsInforming) {
  this.smsInforming = smsInforming;
 }

 public void getSmsInforming(){
   System.out.println("Функция SMS информирования: " + smsInforming);
  }
}