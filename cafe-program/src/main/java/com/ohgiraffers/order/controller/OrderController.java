package com.ohgiraffers.order.controller;

import com.ohgiraffers.order.dto.OrderDTO;
import com.ohgiraffers.order.service.OrderService;

import java.util.ArrayList;

public class OrderController {

    private final OrderService orderService = new OrderService();

    public String order(OrderDTO orderDTO){ // 등록
        // 컨트롤러 계층에서는 각 기능을 수행하기 위한 필수값의 누락이 있는지 검사한다.
        if(orderDTO.getMenuName().equals("")){
            return "메뉴를 정해주세요.";
        }

        if(orderDTO.getQuantity() <= 0){
            return "수량을 입력해주세요.";
        }
        // service 로직으로 넘김
        String result = orderService.order(orderDTO);
        return result;
    }

    public String orderDelete(int nom){ // 삭제

        String result = orderService.orderDelete(nom);
        return result;
    }

    public String orderModify(){ // 수정

        return "주문수정";
    }

    public String orderRead(int serch){ // 상세조회

        if(serch < 0){
            return "메뉴 번호를 잘못 입력하셨습니다.";
        }
        OrderDTO orderDTO = orderService.orderRead(serch);

        if(orderDTO == null){
            return "존재하지 않는 주문입니다.";
        }

        return orderDTO.toString();
    }

    public String OrderDetail() { //전체조회

        ArrayList orderList = orderService.OrderDetail();
        String result = "주문 목록 : " + orderList.toString();
        return result;
    }

}
