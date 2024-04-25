package com.ohgiraffers;

import com.ohgiraffers.order.controller.OrderController;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){

        OrderController orderController = new OrderController();
        Scanner sc = new Scanner(System.in);
        boolean order = true;
        String result = "";

        while(order){

            System.out.println("1. 주문 등록");
            System.out.println("2. 주문 삭제");
            System.out.println("3. 주문 수정");
            System.out.println("4. 주문 상세조회");
            System.out.println("5. 주문 전체조회");
            System.out.print("어떤 메뉴를 동작하시겠나요?");

            int input = sc.nextInt();
            sc.nextLine();

            switch(input){
                case 1 : //주문등록
                    System.out.println("몇개의 음료를 주문하실껀가요? ");
                    int cnt = sc.nextInt();
                    sc.nextLine();

                    OrderDTO[] orders = new OrderDTO[cnt];
                    for(int i = 0; i < orders.length; i++){
                        System.out.println("주문할 메뉴 이름을 알려주세요. : ");
                        String menuName = sc.nextLine();

                        System.out.println("수량을 입력해 주세요. : ");
                        int quantity = sc.nextInt();

                        System.out.println("가격을 입력해주세요. : ");
                        int price = sc.nextInt();
                        sc.nextLine();

                        orders[i] = new OrderDTO(menuName, quantity, price);
                    }

                    result = orderController.order(orders);
                    break;

                case 2 : //주문삭제

                    System.out.println("삭제할 제품의 번호를 입력해주세요.");

                    int nom = Integer.parseInt(sc.nextLine());

                    result = nom + "번 ";
                    result += orderController.orderDelete(nom);
                    break;

                case 3 : //주문수정
                    orderController.orderModify();
                    break;

                case 4 : //주문상세조회

                    System.out.println(orderController.OrderDetail());

                    System.out.println("상세 조회하실 주문 순서를 적어주세요. : ");

                    int serch = sc.nextInt();
                    sc.nextLine();
                    result = orderController.orderRead(serch);
                    break;

                case 5 : //주문전체조회

                    result = orderController.OrderDetail();
                    break;

                default :
                    System.out.println("입력이 잘못되었습니다.");
                    break;
            }

            System.out.println(result);
            System.out.println("주문을 종료하시겠나요?");
            order = sc.nextBoolean();

        }

    }

}
