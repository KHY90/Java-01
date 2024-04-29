package com.ohgiraffers.section02.extend;

public class RabbitFarm <T extends Rabbit>{ // Rabbit 의 하위 타입만 상속이 가능하다.

    private T animal;

    public RabbitFarm(){
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }


}
