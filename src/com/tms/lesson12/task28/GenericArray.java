package com.tms.lesson12.task28;

//Задание №28 из методички №2. Написать класс, который умеет хранить в себе массив любых типов данных (int, long
//etc.). Реализовать метод get(int index), который возвращает любой элемент массива по индексу.

public class GenericArray<T> {
  private T[] someArray;

  public void setSizeSomeArray(T[] someArray) {
    this.someArray = someArray;
  }

  public T[] getSomeArray() {
    return someArray;
  }

  public void setValueByIndex(int index, T value) {
    try {
      someArray[index] = value;
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("Веден неверный индекс! значение " + value + " по индексу " + index + " не установлено!");
    }
  }

  public T getValueByIndex(int index) {
    try {
      return someArray[index];
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("Индекса под номером " + index + " не существует. Введите другой индекс!");
      return null;
    }
  }
}