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
    SamsungHead samsungHead = new SamsungHead(70);
    SamsungHand samsungHand = new SamsungHand(33);
    SamsungLeg samsungLeg = new SamsungLeg(43);

    SonyHead sonyHead = new SonyHead(80);
    SonyHand sonyHand = new SonyHand(44);
    SonyLeg sonyLeg = new SonyLeg(21);

    ToshibaHead toshibaHead = new ToshibaHead(60);
    ToshibaHand toshibaHand = new ToshibaHand(15);
    ToshibaLeg toshibaLeg = new ToshibaLeg(35);

    Robot robotOne = new Robot("T-1000", samsungHead, toshibaHand, sonyLeg);
    Robot robotTwo = new Robot("T-800", sonyHead, samsungHand, toshibaLeg);
    Robot robotThree = new Robot("T-300(Raptor)", toshibaHead, sonyHand, samsungLeg);

    robotOne.action();
    robotTwo.action();
    robotThree.action();

    Robot.compareRobotsCost(robotOne, robotTwo, robotThree);
  }
}