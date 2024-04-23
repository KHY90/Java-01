package com.ohgiraffers.section03.abstraction.problem3;

public class CarRacer {

    private Car car; // CarRace 클래스 안에 Car 필드 / carracer 에게 1개의 차를 줘서 오류가 나지않게함

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void startUp(){
        this.car.startUp();
    }

    public void turnOff(){
        this.car.turnOff();
    }

    public void go(){
        this.car.go();
    }

    public void stop(){
        this.car.stop();
    }

    public void myCarInfo(){
        System.out.println(this.car.carName());
    }

}
