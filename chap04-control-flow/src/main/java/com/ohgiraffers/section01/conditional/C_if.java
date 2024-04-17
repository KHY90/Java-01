package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_if {
    public void testCalculator(){

            Scanner sc = new Scanner(System.in);

            System.out.print("첫번째 숫자를 입력하세요: ");
            double num1 = sc.nextDouble();
            sc.nextLine();

            System.out.print("수식을 입력하세요: ");
            char simbol = sc.nextLine().charAt(0); // char 변수 입력받기

            System.out.print("두번째 숫자를 입력하세요: ");
            double num2 = sc.nextDouble();
            sc.nextLine();

            System.out.print("");
            if (simbol == '+') {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            } else if (simbol == '-') {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            } else if (simbol == '*') {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            } else if (simbol == '/') {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
        }

    }
