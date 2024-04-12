package com.ohgiraffers.section02.variable;

public class Application02 {
    public static void main(String[] args){

        /*
        * 자료형이란/
        * 다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 compiler와 약속한 키워드이다.
        * 예) 앞으로 사용한 int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급하겠다는 약속이다.
        *    이러한 자료형은 기본자료형(primary type)과 참조자료형(Referance type)으로 나뉘어진다.
        *    그 중 기본자료형 8가지 부터 살펴본다.
        * */


        // 정수를 취급하는 자료형은 4가지가 있다.
        byte bnum;       // 1byte
        short snum;      // 2byte
        int inum;        // 4byte
        long lnum;       // 8byte

        // 실수를 취급하는 자료형은 2가지이다.
        float fnum;      // 4byte
        double dnum;     // 8byte

        // 문자를 취급하는 자료형은 1가지이다.
        char ch;          // 2byte

        // 논리형을 취급하는 자료형은 1가지이다.
        boolean istrue;   // 1byte

        // ========================= 문자열은 기본자료형은 아니다.==========
        // 문자열을 취급하는 자료형
        String str;       // 4byte

        // 변수 초기화하기
        bnum = 1;
        snum = 2;
        inum = 3;
        lnum = 4L;  // 롱타입은 L을 붙여 알려줘야한다.

        // 실수 값을 초기화하기
        fnum = 0.3f;  // double 이 기본값이라 f를 붙인다.
        dnum = 0.4;

        // 논리를 취급하는 자료형에 값 대입
        istrue = true;
        istrue = false;

        // 문자
        ch = 'A';
        ch = 97;

        // 문자열을 취급하는 자료형에 값 대입
        str = "안녕하세요";






    }
}

