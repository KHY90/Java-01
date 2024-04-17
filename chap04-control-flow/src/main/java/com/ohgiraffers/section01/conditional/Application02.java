package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args){

        C_if cIf = new C_if();
        cIf.testCalculator();
    }
}
/*
 *  계산기 만들기
 *  두 수와 연산기호를 입력받아
 *  수식에 맞는 연산을 수행하는 프로그램을 만들어주세요.
 * */

/*
 * 스케닝 초기화
 * 연산 순서 코드
 * if문 작성시작
 * 연산 == +
 * else == -
 * else == *
 * else == /
 * */
/*
* 1. calculator 메서드를 만든다.
*   public String calculator(){
* 2. 수를 입력받는다.
*   int first = sc.nextInt();
* 3. 연산기호 입력받는다.
*   char operator = sc.nextLine().charAt(0);
* 4. 수를 입력받는다.
*   int second = sc.nextInt();
* 5. 연산을 진행한다.
*   double result;
*   if(operator == '+' ){
*       result = first + second;
*   } else if (operator == '-' ){
*       result = first - second;
*   } else if (operator == '*'){
*       result = first * second;
*   } else {
* 6. 반환한다.
*       result = first / second;
*   }
*       return ""+result; (= return String.valueOf(result);)(result를 str 값으로 변환)
* }
* */

