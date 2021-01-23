package com.tms.lesson4;
// Задание 7 из методички. Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//полностью закрыть круглой картонкой радиусом r.
public class RadiusSearch {
  public static void main(String[] args) {
    int rectangleWidth = 3;
    int rectangleLength = 7;
    float diagonal = (float) Math.sqrt((rectangleWidth * rectangleWidth) + (rectangleLength * rectangleLength));
    float rounding = (float) Math.pow(10, 2); // переменная для округления
    diagonal = (float) Math.ceil(diagonal * rounding) / rounding; // округляем до второго знака после запятой
    float radius = diagonal / 2;

    System.out.println("Если радиус картонки равен (или больше) " + radius +
            " то она полностью закроет собой прямоугольное отверстие размером "
            + rectangleLength + "х" + rectangleWidth);
  }
}
