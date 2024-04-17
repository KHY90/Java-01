package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

//    public void testSimpleIfStatment(){
//        /*
//        *  [if 표현식]
//        *  if(조건식){
//        *    조건식이 참인 경우에 실행할 명령문
//        *  }
//        *  조건식 : true or false가 나오는 연산식을 의미한다.
//        * */
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("값을 입력해주세요.");
//        int num = sc.nextInt();
//        // 2의 배수면 n은 2의 배수입니다.
//        // 0이면 n은 0입니다.
//        // 2의 배수가 아니면 n은 2의 배수가 아닙니다.
//
//        if(num == 0){
//            System.out.println(num + "은 0 입니다.");
//        }else if((num % 2) != 0){
//            System.out.println(num + "은 2의 배수가 아닙니다.");
//            }else if((num % 2) == 0){
//                System.out.println(num + "은 2의 배수 입니다.");
//        } ///1번

//        //  1. calculator 메서드를 만든다.
//             public String calculator(){
//                 Scanner sc = new Scanner(System.in);
//        // 2. 수를 입력받는다.
//            int first = sc.nextInt();
//        // 3. 연산기호 입력받는다.
//            char operator = sc.nextLine().charAt(0);
//        // 4. 수를 입력받는다.
//            int second = sc.nextInt();
//        // 5. 연산을 진행한다.
//            double result;
//            if(operator == '+' ){
//            result = first + second;
//         } else if (operator == '-' ){
//            result = first - second;
//            } else if (operator == '*'){
//            result = first * second;
//        } else {
//            // 6. 반환한다.
//          result = first / second;
//   }
//       return ""+result;// (= return String.valueOf(result);)//(result를 str 값으로 변환)
// }
    public String call () {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] target = input.split(" ");
        int result = 0;

        if (target[1].equals("+")) {
            result = Integer.parseInt(target[0]) + Integer.parseInt(target[2]);
            System.out.println(result);
        }
        return "" + result;
    }
}

