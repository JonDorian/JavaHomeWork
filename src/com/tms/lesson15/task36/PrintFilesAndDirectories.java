package com.tms.lesson15.task36;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

//Задание №36 из методички 3. Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
//должны быть распечатаны отдельно.

public class PrintFilesAndDirectories {
  public static void main(String[] args) {
    File info = new File("src/com/tms/lesson15/task36");
    File[] anyTypeArray = info.listFiles();
    List<File> listOfFiles = new ArrayList<>();
    List<File> listOfDirectories = new ArrayList<>();

    assert anyTypeArray != null;
    for (File type : anyTypeArray) {
      if (type.isFile()) {
        listOfFiles.add(type);
      } else {
        listOfDirectories.add(type);
      }
    }

    System.out.println("Список файлов в директории:");
    for (File file : listOfFiles) {
      System.out.println(" - " + file.getName());
    }

    System.out.println("Список каталогов в директории:");
    for (File directory : listOfDirectories) {
      System.out.println(" - " + directory.getName());
    }
  }
}