package com.ohgiraffers.section01.conditional;

// D_switch 라는 클래스를 모두가 사용할 수 있도록 한다.

import java.util.Scanner;

public class D_switch { // D_switch의 시작
    //클래스 내부 속성
    // testSimpleSwitchStatement 라는 반환값이 없는 메서드를 모두가 사용할 수 있도록 한다.
    public void testSimpleSwitchStatement() { //testSimpleSwitchStatement의 시작
        /*
         * [switch문 표현식]
         *  switch(비교대상값){
         *   case 비교값 : 비교값이 참인 경우 실행할 구문; break;
         *   case 비교값 : 비교값이 거짓인 경우 실행할 구문; break;
         *   dafault : case에 모두 해당하지 않는 경우; break;
         * }
         * */

        // 사용자한테 값을 입력받을 수 있는 객체를 생성함.
        Scanner sc = new Scanner(System.in);
        // 화면에 "첫번재 정수 입력 : "을 출력함.
        System.out.println("첫번째 정수 입력 : ");
        // 사용자가 입력한 값을 정수로 받아 first에 대입함
        int first = sc.nextInt();
        sc.nextLine();
        // 화면에 "두번재 정수 입력 : "을 출력함.
        System.out.println("두번재 정수 입력 : ");
        // 사용자가 입력한 값을 정수로 받아 second에 대입함
        int second = sc.nextInt();
        sc.nextLine();
        // 화면에 "연산 기호 입력 : "을 출력함.
        System.out.println("연산 기호 입력 : ");
        // 사용자가 입력한 값을 문자로 받아 op에 대입함
        char op = sc.nextLine().charAt(0);
        // 아래의 계산기를 완성합니다.
        // 연산은 + - * / 가 가능하며 이외는 계산 불가능이라는 결과를 화면에 출력합니다.

        switch (op) { // op의 변수를 기준으로 아래의 값과 일치하는지 확인함.
            // op가 +와 같다면 first + second 값을 출력함.
            case '+':
                System.out.println(first + second);
                break;
            // op가 -와 같다면 first - second 값을 출력함.
            case '-':
                System.out.println(first - second);
                break;
            // op가 *와 같다면 first * second 값을 출력함.
            case '*':
                System.out.println(first * second);
                break;
            // op가 /와 같다면 first / second 값을 출력함.
            case '/':
                System.out.println(first / second);
                break;
            // op가 위의 수식에 모두 만족하지 않으면 계산 불가능을 출력함.
            default:
                System.out.println("계산 불가능");
                break;

        }

    }//testSimpleSwitchStatement의 종료

    // 계산기를 만들고 결과를 반환한다. switch를 이용해서 Application03에 반환 값을 출력해주세요.
    // '+,-,*,/' 만 제공하고 일치하는 연산이 없는 경우 연산불가라는 결과를 출력하고 반환 값을 0.0으로 합니다.
    /*
     * 1. 값을 입력받음
     * 2. 첫번째 수 입력받기
     * 3. 두번째 수 입력받기
     * 4. 기호 입력받기
     * 5. switch문으로 기호 별 출력값 입력하기
     * 6. 리턴 값 0.0 입력하기
     * */
    public double switchCalculator() {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("첫번째 수를 입력하세요. : ");
        int num1 = sc1.nextInt();
        sc1.nextLine();
        System.out.println("두번째 수를 입력하세요. : ");
        int num2 = sc1.nextInt();
        sc1.nextLine();
        System.out.println("기호를 입력하세요. : ");
        char op1 = sc1.nextLine().charAt(0);
        double result = 0.0;

        switch (op1) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("연산불가");
                break;

        }
        return result;
    }

    // 등급 계산기 프로그램
    // main에서 학생의 성적을 입력받고 아래의 메서드에서 학생의 등급을 화면에 출력해주세요.
    // 100 = a+
    // 100~91 = a
    // 90-~86 = b+
    // 85~76 = b
    // 75~60 = c
    // 60미만 = d
    // f는 없다.

    // 3. 메서드를 만든다.
            public void testTier(int result){
    // 4. if문으로 성적별 등급 나누기 입력
                String tier;
                if (result == 100) {
                    tier = "A+";
                } else if (result >= 91 && result <= 100) {
                    tier = "A";
                } else if (result <= 90 && result >= 86) {
                    tier = "B+";
                } else if (result <= 85 && result >= 76) {
                    tier = "B";
                } else if (result <= 75 && result >= 60) {
                    tier = "C";
                } else {
                    tier = "D";
                }
    // 5. 등급 출력문
            System.out.println("입력하신 학생의 점수는 " + tier + "등급 입니다.");

        }

    }//D_switch의 종료
