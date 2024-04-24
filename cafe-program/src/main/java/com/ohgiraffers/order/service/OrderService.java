package com.ohgiraffers.order.service;

import com.ohgiraffers.order.dao.OrderRepository;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderService {
    // 서비스 계층
    // 비즈니스 로직 수행 및 데이터 베이스의 대한 리소스를 관리한다.

    private final OrderRepository orderRepository = new OrderRepository();

    public String order(OrderDTO orderDTO){ // 주문 등록
        if(!orderDTO.getMenuName().equals("아메리카노")){
            return "주문 실패";
        }
        if(orderDTO.getPrice() <= 0){
            return "땅파서 장사하냐?";
        }

        String result = orderRepository.order(orderDTO);

        return result;
    }

    public String orderDelete(int nom){ // 주문 삭제

        String result = orderRepository.orderDelete(nom);
        return result;
    }

    public OrderDTO orderRead(int serch){ // 상세조회

        OrderDTO order = orderRepository.orderRead(serch);
        return order;
    }

    public ArrayList OrderDetail(){ // 전체조회

        ArrayList menuList = orderRepository.OrderDetail();
        return menuList;
    }

}
