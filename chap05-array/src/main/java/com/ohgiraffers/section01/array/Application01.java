package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args){
        /*
        *  배열이란?
        *  동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다.
        *  배열은 heap 영역에 new 연산자를 이용하여 할당한다.
        * */
        /*
        *  배열의 사용 이유
        *  만약 배열을 사용하지 않는다면 변수를 여러개 사용해야 한다.
        *  1. 연속된 메모리 공간을 관리할 수 없다.
        *  2. 반복문을 이용한 연속 처리가 불가능하다.
        * */

        String berad  = "식빵";
        String berad1 = "식빵";
        String berad2 = "식빵";
        String berad3 = "식빵";
        String berad4 = "식빵";
        String berad5 = "식빵";
        String berad6 = "식빵";
        String berad7 = "식빵";
        String berad8 = "식빵";
        String berad9 = "식빵";

        // 배열을 사용한다면
        // 배열의 표현식
        // 자료형[] 변수명 = 자료형[길이];
        String[] breads = new String[10];
        breads[0] = "식빵";
        breads[1] = "식빵";
        breads[2] = "식빵";
        breads[3] = "식빵";
        breads[4] = "식빵";
        breads[5] = "식빵";
        breads[6] = "식빵";
        breads[7] = "식빵";
        breads[8] = "식빵";
        breads[9] = "식빵";

//        for(int i = 0; i <= 10; i++ ){
//            System.out.println(breads[i]);
//        }
        // 선언식
//        int[] iarr = new int[5];    // 0~4
//        char carr[] = new char[10]; // 0~10
//
//        iarr[2] = 10;
//        System.out.println(iarr[2]);
//
//        iarr = null;
//        System.out.println(iarr); // null 을 넣어 초기화
//        iarr = new int[8]; // null 이후 다시 선언하는 방법
//        iarr[3] = 10;
//        System.out.println(iarr[3]);
//
//        int result = 100;
//        int newArray[] = new int[result];
//        for(int i=0; i < newArray.length; i++){ // length 는 1부터 센다.
//            newArray[i] = 10;
//
//        }

        Test test = new Test();
        test.avg();

    }

}

