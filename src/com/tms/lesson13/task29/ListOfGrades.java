package com.tms.lesson13.task29;

import java.util.ArrayList;
import java.util.List;

//Задание №29 из методички №3. Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Удалить неудовлетворительные оценки из списка.

public class ListOfGrades {
  private int numberOfStudents;
  private int numberOfPoorStudents = 0;
  private List<Student> gradesList = new ArrayList<>();

  public void setNumberOfStudents(int numberOfStudents) {
    this.numberOfStudents = numberOfStudents;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }

  public List<Student> getGradesList() {
    return gradesList;
  }

  public void setGradesInList() {
    System.out.println("Оценки ученикам выставляются по десятибальной шкале.");
    for (int i = 0; i < getNumberOfStudents(); i++) {
      int grade = (int) (Math.random() * 10 + 1);
      gradesList.add(new Student("Ученик №" + (i + 1), grade));
    }
  }

  public void printListOfGrades() {
    for (Student student : gradesList) {
      System.out.print(student.getName() + ", оценка: " + student.getGrade());
      if (student.getGrade() <= 3) {
        System.out.print(" - неуд!");
        numberOfPoorStudents++;
      }
      System.out.println();
    }
    System.out.println();
  }

  public void deleteBadGrades() {
    while (numberOfPoorStudents > 0) {
      for (int i = 0; i < gradesList.size(); i++) {
        if (gradesList.get(i).getGrade() <= 3) {
          gradesList.remove(i);
          numberOfPoorStudents--;
        }
      }
    }
    System.out.println("Отчисление непутевых учеников выполнено успешно!\n");
  }
}