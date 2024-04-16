package com.ohgiraffers.section05.typecasting;

public class Application03 {
    public static void main(String[] args){

        /*
        * 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
        * 다른 자료형끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리된다.
        * */

        int inum = 10;
        long lnum = 100;

        int isum = inum + (int) lnum;
        System.out.println(isum);
        int isum1 = (int)(inum + lnum); // 정확도를 위해 이렇게 쓰는게 더 좋다.
        System.out.println(isum1);

        byte byteNum1 = 1;
        byte byteNum2 = 2;
        short shortNum1 = 1;
        short shortNum2 = 2;

        int result = byteNum1 + byteNum2;
        // byte = (byte)((int)byte + (int)byte);
        int result2 = shortNum1 + shortNum2;







    }
}
