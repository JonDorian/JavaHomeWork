package com.tms.lesson12.task28;

public class GenericArrayRunner {
  public static void main(String[] args) {
    GenericArray<Double> one = new GenericArray<>();
    one.setSizeSomeArray(new Double[5]);

    one.setValueByIndex(0, 65.4);
    one.setValueByIndex(1, 12.9);
    one.setValueByIndex(2, 41.8);
    one.setValueByIndex(3, 75.1);
    one.setValueByIndex(4, 22.3);

    System.out.println(one.getValueByIndex(4));

    GenericArray<String> two = new GenericArray<>();
    two.setSizeSomeArray(new String[5]);

    two.setValueByIndex(0, "Richard");
    two.setValueByIndex(1, "Tom");
    two.setValueByIndex(2, "Perdun");
    two.setValueByIndex(3, "Ilya");
    two.setValueByIndex(4, "Masha");

    System.out.println(two.getValueByIndex(2));
  }
}