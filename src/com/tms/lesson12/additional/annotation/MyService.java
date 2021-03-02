package com.tms.lesson12.additional.annotation;

import java.util.Objects;

@ClassInfo(version = 5.0, codeName = "Lollipop")
public class MyService {
  private String serviceName;
  private int priceOfWork;
  private float leadTime;

  MyService () {
    setServiceName("Перепрошивка смартфона");
    setPriceOfWork(25);
    setLeadTime(1.5);
  }

  MyService(String serviceName, int priceOfWork, double leadTime) {
    setServiceName(serviceName);
    setPriceOfWork(priceOfWork);
    setLeadTime(leadTime);
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public String getServiceName() {
    return serviceName;
  }

  public void setPriceOfWork(int priceOfWork) {
    this.priceOfWork = priceOfWork;
  }

  public int getPriceOfWork () {
    return priceOfWork;
  }

  public void setLeadTime(double leadTime) {
    this.leadTime = (float) leadTime;
  }

  public float getLeadTime() {
    return leadTime;
  }

  private void methodWithParameters(int param) {
    System.out.println("Метод с параметрами идет мимо цикла!");
  }

  private void getInfoAboutService(){
    System.out.println("Наиенование услуги: " + getServiceName() + ", стоимость: "
            + getPriceOfWork() + "$, время выполнения: " + getLeadTime() + "ч.");
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MyService myService = (MyService) o;
    return priceOfWork == myService.priceOfWork &&
            Float.compare(myService.leadTime, leadTime) == 0 &&
            Objects.equals(serviceName, myService.serviceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, priceOfWork, leadTime);
  }
}