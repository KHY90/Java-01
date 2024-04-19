package com.ohgiraffers.section02.looping;

public class B_while {

    public void testSimpleWhileStatement(){

        /*
        * [while문 표현식]
        *  초기식;
        *  while(조건식){
        *       조건식을 만족하는 경우 수행할 구문(반복할 구문);
        *       증감식;
        *  }
        *
        *  while(조건식){
        *       조건식을 만족하는 경우수행할 구문;
        *  }
        * */

        int i = 1;
        while(i <= 10 ){ // 반복해야 하는 대상의 길이를 알 수 없을 때 사용한다.
            System.out.println(i);
            i++;

        }

    }
    //구구단 만들기
    /*
     *  1. int x, y
     *  2. while(조건식 = x,y <=10)
     *  3. 중첩 while조건식
     *  3. 연산 출력문 x*y
     *  4. 중첩 while 증감식
     *  5. while 증감식
     *  6. 중첩 while 조건 변수 초기화
     * */
    public void whileGugudan() {

        int x = 2;
        while (x <= 9){
            int y = 1;
            while( y <= 9){
                System.out.println( x+" * " + y + " = " + ( x * y ) );
                y++;
            }
            x++;
        }
    }
}
