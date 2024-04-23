package com.ohgiraffers.section03.abstraction.problem3;

public class Application01 {
    public static void main(String[] args) {

        Car ram = new Car();
        ram.setName("람보르기니");
        Car po = new Car();
        po.setName("포르쉐");

        CarRacer kim = new CarRacer();
        kim.setCar(ram);
        kim.myCarInfo();

        kim.startUp();
        po.go();

        kim.go();
        kim.stop();
        kim.turnOff();

    }
}
