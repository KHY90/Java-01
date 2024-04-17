package main.java.com.ohgiraffers.section04.scanner;

import main.java.com.ohgiraffers.section01.method.Application03;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

//            Scanner sc = new Scanner(System.in); // 클래스 = 사용자 정의타입(자료형) / new : 메모리에 올린다.
//            // sc 변수명 = 메모리주소 = 값
//            System.out.print("당신의 이름을 입력해주세요. : ");
//            String name = sc.nextLine();
//            System.out.println("입력하신 당신의 이름은 " + name + "입니다.");
//
//            System.out.println("당신의 나이를 입력해주세요. : " );
//            int age = sc.nextInt();
//            System.out.println("당신의 나이는 "+ age + "세 입니다.");
//
//            System.out.println("당신의 키를 입력해주세요. : ");
//            double tall = sc.nextDouble();
//            System.out.println("당신의 키는 " + tall + "cm 입니다.");
//
//            System.out.println("당신의 성별을 입력해주세요. : ");
//            String gender = sc.nextLine();
//            System.out.println("당신의 성별은 "+ gender + "입니다.");

        Application01 app1 = new Application01();
        String info = app1.inputInfo();
        System.out.println(info);


    }
    /*
     *  inputInfo 매서드를 만들고
     *  사용자의 이름 키 성별 나이를 입력받아 main에서 출력
     * */
    /*
     *  1. inputInfo 함수만들기
     *     접근제어자 반환타입 매서드명(){}
     *  2. 사용자에게 값을 입력받는다.
     *     Scanner sc = new Scanner();
     *  3. 이름 키 성별 나이를 입력받아 문자열로 합친다.
     *
     *  4. 문자열로 반환한다.
     *     return
     * */

    public String inputInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름은 무엇인가요?");
        String name = sc.nextLine();

        System.out.print("당신의 키는 몇인가요?");
        double tall = sc.nextDouble();
        sc.nextLine();

        System.out.print("당신의 성별은 무엇인가요?");
        char gender = sc.nextLine().charAt(0);

        System.out.print("당신의 나이는 몇인가요?");
        int age = sc.nextInt();

        return "당신의 이름은 " + name + "입니다. \n" + "당신의 키는 " + tall + "입니다. \n" + "당신의 성별은 " + gender + "입니다. \n" + "당신의 나이는 " + age + "세 입니다.";


    }
}