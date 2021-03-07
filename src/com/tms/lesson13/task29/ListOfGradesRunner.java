package com.tms.lesson13.task29;

public class ListOfGradesRunner {
  public static void main(String[] args) {
    ListOfGrades list = new ListOfGrades();
    list.setNumberOfStudents(10);
    list.setGradesInList();
    list.printListOfGrades();
    list.deleteBadGrades();
    list.printListOfGrades();
  }
}
