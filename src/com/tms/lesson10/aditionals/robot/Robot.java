package com.tms.lesson10.aditionals.robot;

import com.tms.lesson10.aditionals.robot.hands.IHand;
import com.tms.lesson10.aditionals.robot.heads.IHead;
import com.tms.lesson10.aditionals.robot.legs.ILeg;

public class Robot implements IRobot {
  private String name;
  private IHead head;
  private IHand hand;
  private ILeg leg;

  public Robot(String name, IHead head, IHand hand, ILeg leg) {
    this.name = name;
    this.head = head;
    this.hand = hand;
    this.leg = leg;
  }

  public Robot() {
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public IHead getHead() {
    return head;
  }

  public void setHead(IHead head) {
    this.head = head;
  }

  public IHand getHand() {
    return hand;
  }

  public void setHand(IHand hand) {
    this.hand = hand;
  }

  public ILeg getLeg() {
    return leg;
  }

  public void setLeg(ILeg leg) {
    this.leg = leg;
  }

  @Override
  public void action() {
    System.out.println("Робот " + name + " активирован!");
    head.speek();
    hand.upHand();
    leg.step();
    System.out.println();
  }

  /**
   * Get the cost of a robot
   *
   * @return int
   */
  @Override
  public int getPrice() {
    return head.getPrice() + hand.getPrice() + leg.getPrice();
  }

  public static void compareRobotsCost(Robot robotOne, Robot robotTwo, Robot robotThree) {
    if (robotOne.getPrice() > robotTwo.getPrice() && robotOne.getPrice() > robotThree.getPrice()) {
      System.out.println(robotOne.name + " самый догорой! Его полня стоимость равна: " + robotOne.getPrice() + "млн.");
    } else if (robotTwo.getPrice() > robotOne.getPrice() && robotTwo.getPrice() > robotThree.getPrice()) {
      System.out.println(robotTwo.name + " самый догорой! Его полня стоимость равна: " + robotTwo.getPrice() + "млн.");
    } else if (robotThree.getPrice() > robotOne.getPrice() && robotThree.getPrice() > robotTwo.getPrice()) {
      System.out.println(robotThree.name + " самый догорой! Его полня стоимость равна: " + robotThree.getPrice() + "млн.");
    }
  }
}