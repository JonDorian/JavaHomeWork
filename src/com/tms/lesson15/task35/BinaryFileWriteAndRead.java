package com.tms.lesson15.task35;
import java.io.*;

// Задание №35 из методички 3. Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
//распечатать числа и их среднее арифметическое.

public class BinaryFileWriteAndRead {
  public static void main(String[] args) {
    DataOutputStream dos = null;
    DataInputStream dis = null;
    int arithmeticMean;
    int sumOfNumbers = 0;
    int counterNumbers = 0;

    try {
      dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/com/tms/lesson15/task35/textFile.dat")));
    } catch (FileNotFoundException e) {
      System.out.println("Файл не создан!");
    }

    for (int i = 0; i < 20; i++) {
      int temp = (int) (Math.random() * 127 + 1);
      try {
        assert dos != null;
        dos.writeInt(temp);
        if (i == 19) {
          dos.close();
        }
      } catch (IOException e) {
        System.out.println("Невозможно записать данные в файл(");
      }
    }

    try {
      dis = new DataInputStream(new BufferedInputStream(new FileInputStream("src/com/tms/lesson15/task35/textFile.dat")));
    } catch (FileNotFoundException e) {
      System.out.println("Файл не найден!");
    }

    try {
      assert dis != null;
      int number = dis.readInt();
      while (true) {
        System.out.print(number + " ");
        counterNumbers++;
        sumOfNumbers += number;
        try {
          number = dis.readInt();
        } catch (EOFException e) {
          break;
        }
      }
      dis.close();
    } catch (IOException e) {
      System.out.println("Невозможно прочитать данные файла!");
    }

    arithmeticMean = sumOfNumbers / counterNumbers;
    System.out.println();
    System.out.println("Среднее арифметическое всех чисел в файле: " + arithmeticMean);
  }
}