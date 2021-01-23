package com.tms.lesson4.additional;

// Дополнительное задание №3. Дано целое число. Если оно является положительным, то прибавить к нему 1.
//Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
//10. Вывести полученное число.

public class Task3 {
  public static void main(String[] args) {
    int number = (int) (Math.random() * 15);

    if (number > 0) {
      number +=1;
    } else  {
      number -=2;
    }
    if (number == 0) {
      number = 10;
    }

    System.out.println("Искомое число равняется: " + number);

  }
}
