package com.ohgiraffers.section06.sigleton;

public class EagerSingleton {

    private static EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("생성됨");
    }

    public static EagerSingleton getInstance(){
        return singleton;
    }

}
