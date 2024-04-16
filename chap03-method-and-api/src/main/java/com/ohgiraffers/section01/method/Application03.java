package main.java.com.ohgiraffers.section01.method;

public class Application03 {
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        Application03 app3 = new Application03();
        int result = app3.plus(x,y);

        System.out.println("x+y = " + result);

        int x2 = 39;
        int y2 = 22;
        Application03 app4 = new Application03();
        int result2 = app4.minus(x2,y2);
        System.out.println("x2-y2 = " + result2);

        int x3 = 54;
        int y3 = 39;
        Application03 app5 = new Application03();
        int result3 = app5.multiplication(x3,y3);
        System.out.println("x3*y3 = " + result3);

        int x4 = 33;
        int y4 = 21;
        Application03 app6 = new Application03();
        double result4 = app6.division(x4,y4);
        System.out.println("x4 / y4 = " + result4);

        String name = "김화연";
        int age = 33;
        char gender = '남';
        String phone = "010-9397-9931";
        Application03 app7 = new Application03();
        String result5 = app7.myInfo("김화연",33,'남',"010-9397-9931");
        System.out.println(result5);

        System.out.println(app7.myInfo("김화연",33,'남',"010-9397-9931"));

    }

    // 두 수를 더하는 함수
    // 접근제어자 + 반환타입 + 함수명(매개변수){}
    public int plus(int x, int y){
        int result = x + y;
        return result;

    }

    // 두 수를 빼는 함수
    public int minus(int x2, int y2){
        int result2 = x2 - y2;
        return result2;
    }

    // 두 수를 곱하는 함수
    public int multiplication(int x3, int y3){
        int result3 = x3 * y3;
        return result3;

    }

    // 두 수를 나누는 함수
    public double division(int x4, int y4){
        double result4 = (double) x4 / y4;
        return result4;

    }
    /*
    *  myinfo 함수 만들고
    *  이름 : 문자열
    *  나이 : 정수
    *  성별 : 문자
    *  전화번호 : '-'를 포함한 전화번호
    * 위 4개의 자료형을 매개변수로 받아 하나의 문자열로 더하고 main에서 출력
    * */

    //1.myInfo 함수 만들기
    //2.매개변수(String name, int age, char gender, String phone)
    //3.매개변수 더하기
    //4.return result

    public String myInfo(String name, int age, char gender, String phone ){
        String result5 = ( "이름 : " + name + ", 나이 : " + age + ", 성별 : " + gender + ", 전화번호 : " + phone );
        return result5;

    }

}
