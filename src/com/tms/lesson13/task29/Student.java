package com.tms.lesson13.task29;

public class Student {
  private String name;
  private int grade;

  Student(String name, int grade) {
    this.name = name;
    this.grade = grade;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public int getGrade() {
    return grade;
  }
}
