package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

// 프로그램 내에서 모두가 사용할 수 있는 Applicaiton03 이라는 클래스를 선언한다.
public class Application03 {

    // 프로그램이 시작 시 바로 사용할 수 있도록 static 영역에 main 이라는 함수를 만들고 문자열 배열의 타입을 가진 args라는 변수를 선언한다.
    public static void main(String[] args){

        // D_switch라는 자료형을 가진  dSwitch 변수를 만들고 D_switch 타입으로 값을 제공한다.
        // D_switch는 사용자 정의 자료형으로써 타입은 우리가 만든 D_switch를 확인해야한다.
        // dSwitch 변수가 가지고 있는 testSimpleSwitchStatement 메서드를 실행한다.
        // dSwitch.testSimpleSwitchStatement();

    //=========1번문제======================================
        // 1.값을 반환 받는다.
       D_switch dSwitch = new D_switch();
    //    double result = dSwitch.switchCalculator();
        // 2. 화면에 출력한다.
    //    System.out.println(result);

    //===========2번 문제====================================
        //1. main에서 성적을 입력받기.
        Scanner sc1 = new Scanner(System.in);
        System.out.println("학생의 성적을 입력해주세요.");
        int result = sc1.nextInt();
        //2. 입력받은 성적을 매개변수로 전달한다.
        dSwitch.testTier(result);

    }
}