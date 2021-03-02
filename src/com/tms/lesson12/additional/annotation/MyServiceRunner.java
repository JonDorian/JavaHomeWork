package com.tms.lesson12.additional.annotation;

import java.lang.reflect.InvocationTargetException;

public class MyServiceRunner {
  public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
    Class<MyService> service = MyService.class;
    CheckAnnotation.goCheckAnnotation(service);
  }
}