package com.ohgiraffers.section04.overflow;

public class Application01 {
    public static void main(String[] args){

        // 자료형 별 값의 최대 범위를 벗어나는 경우 발생한 carry를 버림처리하고 sing bit를 반전시켜 최소값으로 순환시킴

        byte num1 = 127;
        System.out.println("byte num : " + num1);
        num1++;

        System.out.println("byte num : " + num1);

        int firstNum = 1000000;
        int secondNum = 700000;
        System.out.println("first num * second num = " + (firstNum*secondNum));
        //int 범위  -2,147,483,648 ~ 2,147,483,647

        long longMulty = firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + longMulty);

        long result = (long) firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + result);


    }
}