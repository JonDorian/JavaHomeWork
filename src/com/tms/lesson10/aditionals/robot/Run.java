package com.tms.lesson10.aditionals.robot;

import com.tms.lesson10.aditionals.robot.hands.*;
import com.tms.lesson10.aditionals.robot.heads.*;
import com.tms.lesson10.aditionals.robot.legs.*;

public class Run {
  public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
    IHead samsungHead = new SamsungHead(70);
    IHand samsungHand = new SamsungHand(33);
    ILeg samsungLeg = new SamsungLeg(43);

    IHead sonyHead = new SonyHead(80);
    IHand sonyHand = new SonyHand(44);
    ILeg sonyLeg = new SonyLeg(21);

    IHead toshibaHead = new ToshibaHead(60);
    IHand toshibaHand = new ToshibaHand(15);
    ILeg toshibaLeg = new ToshibaLeg(35);

    Robot robotOne = new Robot("T-1000", samsungHead, toshibaHand, sonyLeg);
    Robot robotTwo = new Robot("T-800", sonyHead, samsungHand, toshibaLeg);
    Robot robotThree = new Robot("T-300(Raptor)", toshibaHead, sonyHand, samsungLeg);

    robotOne.action();
    robotTwo.action();
    robotThree.action();

    Robot.compareRobotsCost(robotOne, robotTwo, robotThree);
  }
}