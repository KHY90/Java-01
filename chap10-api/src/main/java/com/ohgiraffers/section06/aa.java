package main.java.com.ohgiraffers.section06;

import java.util.Scanner;

public class aa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 1; i <= 9; i++){
            System.out.println(a + "*" + i + "=" + (a*i));
        }
    }

}
