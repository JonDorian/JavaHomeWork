package com.tms.lesson12.additional.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class CheckAnnotation {
  public static void goCheckAnnotation(Class<?> check) throws IllegalAccessException, InstantiationException, InvocationTargetException {
    if (check.isAnnotationPresent(ClassInfo.class)) {
      ClassInfo info = check.getAnnotation(ClassInfo.class);

      System.out.println("Класс " + check.getSimpleName() + " аннотирован! Кодовое имя сервиса: " +
              info.codeName() + ", номер версии: " + info.version());

      Object obj = check.newInstance();
      Method[] methods = obj.getClass().getDeclaredMethods();

      for (Method x : methods) {
        if (x.getModifiers() == Modifier.PRIVATE && x.getParameterCount() == 0) {
          x.setAccessible(true);
          x.invoke(obj);
        }
      }
    } else {
      System.out.println("Класс не аннотирован!");
    }
  }
}