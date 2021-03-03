package com.tms.lesson13.task31;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//Задание №31 из методички №3. Создать список оценок учеников с помощью ArryList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

public class BestsOfGrades {
  private final List<Student> gradesList = new ArrayList<>();

  public void setGradesInList() {
    System.out.println("Оценки ученикам выставляются по десятибальной шкале.");
    int randomNumber = (int) (Math.random() * 10 + 5);
    for (int i = 0; i < randomNumber; i++) {
      int grade = (int) (Math.random() * 10 + 1);
      gradesList.add(new Student("Ученик №" + (i + 1), grade));
    }
  }

  public void printListOfGrades() {
    for (Student student : gradesList) {
      System.out.println(student.getName() + " - оценка: " + student.getGrade());
    }
    System.out.println();
  }

  public void getBestGrades() {
    ListIterator<Student> iterator = gradesList.listIterator();
    List<Student> bestStudents = new ArrayList<>();
    int maxGrade = 0;

    while (iterator.hasNext()) {
      Student tempOne = iterator.next();
      if (maxGrade < tempOne.getGrade()) {
        maxGrade = tempOne.getGrade();
      }
    }

    while (iterator.hasPrevious()) {
      Student tempTwo = iterator.previous();
      if (maxGrade == tempTwo.getGrade()) {
        bestStudents.add(tempTwo);
      }
    }

    System.out.println("Лучшие ученик(и) школы:");

    for (Student student : bestStudents) {
      System.out.println(student.getName() + " - оценка: " + student.getGrade());
    }
  }
}