package com.ohgiraffers.section02.dementional;

import java.util.Scanner;

public class Go01 {
    public static void main(String[] args) {

        /*
         *  1. 2차원 배열 선언 String
         *  2. 배열 길이 19x19
         *  3. 배열 값 할당
         *  4. 출력
         * */

        char board[][] = new char[30][30];// 30*30 바둑판 배열
        boolean chk[][] = new boolean[30][30];//중복값 판별용 배열

        // ----------------------------------------------------초기 바둑판 양식 배열에 저장
        for (int x = 0; x < 30; x++) {
            for (int y = 0; y < 30; y++) {
                if (x == 0 && y == 0)// 왼쪽 위 모서리막기
                    board[x][y] = '┌';
                else if (x == 29 && y == 29)// 오른쪽 아래 모서리막기
                    board[x][y] = '┘';
                else if (x == 29 && y == 0)// 왼쪽 아래 모서리막기
                    board[x][y] = '└';
                else if (x == 0 && y == 29)// 오른쪽 위 모서리막기
                    board[x][y] = '┐';
                else if (x == 0)// 위에 막기
                    board[x][y] = '┬';
                else if (x == 29)// 아래 막기
                    board[x][y] = '┴';
                else if (y == 0)// 왼쪽 막기
                    board[x][y] = '├';
                else if (y == 29)// 오른쪽 막기
                    board[x][y] = '┤';
                else
                    board[x][y] = '┼';

                chk[x][y] = false;
                System.out.println(board[x][y]);
            }
        }
    }
}