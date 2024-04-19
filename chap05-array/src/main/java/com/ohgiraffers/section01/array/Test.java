package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Test {
         /*
         *  A학생의 평균 점수를 구하는 프로그램을 만들어주세요.
         *  시험과목은 5개로 점수는 정수
         *  5개의 과목 점수를 입력받고 평균을 구하여 화면에 출력
         *  예) A학생의 수학 : 90점, 영어 : 80점, 국어 : 100점, 과학 : 79점, 사회 : 80점이며
         *     평군은 x 점입니다.
         * */

        /*
         *  1. 배열 5개 선언
         *  2. 스케너
         *  3. 정수로 합하여 정수로 나눠 값을 받는다.
         *  4. 화면에 출력한다.
         * */

        public void avg(){

            Scanner sc = new Scanner(System.in);
            int[] score = new int[5];
            int result = 0;

            String[] subject = {"수학", "영어", "국어", "과학", "사회"};

            for (int i = 0; i < score.length; i++) {

                System.out.println("A학생 " + subject[i] + " 점수를 입력해주세요.");
                score[i] = sc.nextInt();
                result += score[i];
            }
            double avg = result / score.length;

            for (int i = 0; i < score.length; i++) {
                System.out.println(subject[i] + " : " + score[i] + " ");
            }
            System.out.println("평균점수 : " + avg );
        }
}
