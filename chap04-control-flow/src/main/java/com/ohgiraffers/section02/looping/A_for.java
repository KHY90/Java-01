package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStstement(){
        /*
        *  [for문]
        *  for(초기식; 조건식; 증감식){
        *   // 조건식이 참인 경우 실행할 구문 == 반복할 구문
        * }
        * */
            // int i 실행 -> i <= 10 실행 -> 몸체(출력) 실행 -> 증감식 실행
        for(int i = 1; i <= 10; ++i){
            for(int x = 1; x <=10; x++){
                System.out.println("천원 단위 : " + x);
            }
            System.out.println("만원 단위 : " + i);
        }
    }
    //구구단 만들기
    /*
    * 1. for문으로 num1 1~9까지 출력
    * 2. for문으로 num2 1~9까지 출력
    * 3. 안쪽에 num1 * num2 출력문
    * 4. 2배수만 출력하기. if문으로 2 몫 계산
    * */

    public void gugudan(){
        for(int num1 = 1; num1 <= 9; num1++){
            for(int num2 = 1; num2 <= 9; num2++){

                if( (num1 * num2) % 2 == 0) {

                    System.out.println("구구단을 외자 " + num1 + " * " + num2 + " = " + (num1 * num2));
                }
            }
        }
    }
    /*
    * 1. num1 을 기준으로 num2가 num1의 배수만 출력
    * */

    public void gugudan2(){
        for(int num1 = 1; num1 <= 9; num1++){
            for(int num2 = 1; num2 <= 9; num2++) {

                if((num2 % num1) == 0 && num1 != 1 ) {

                    System.out.println("구구단을 외자 "+ num1 + " * " + num2 + " = " + (num1 * num2));

                }
            }
        }
    }
    // 10명의 학생 이름, 나이를 입력받아 출력
    // 1. 스켄 2. 이름 입력창 3. 나이 입력창 for문 10명

    public void student(){

        for(int x = 1; x <= 10; x++){

            Scanner sc = new Scanner(System.in);
            System.out.println( x + "번째 학생의 이름을 입력해주세요.");
            String y = sc.nextLine();

            System.out.println( x + "번째 학생의 나이를 입력해주세요.");
            int z = sc.nextInt();

            System.out.println( x +"번 학생의 이름 : " + y + "\n" + x + "번 학생의 나이 : "+z);

        }
    }
}
