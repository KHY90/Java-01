package com.ohgiraffers.order.dao;

import com.ohgiraffers.fakeDB.OrderDB;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderRepository {

    private final OrderDB orderDB = OrderDB.getInstance();

    private final ArrayList orders = new ArrayList();

    public final String order(OrderDTO orderDTO){
        // 0
        int oldNum = orders.size();

        orders.add(orderDTO);
        if(oldNum >= orders.size()){
            return "등록실패";
        }
        return "등록성공";
    }

    public String orderDelete(int nom){
        int oldSize = orderDB.getOrders().size();
        orderDB.getOrders().remove(nom);

        if(orderDB.getOrders().size() >= oldSize){
            return "주문 취소가 실패하였습니다.";
        }
        return "주문이 취소되었습니다.";
    }

    public OrderDTO orderRead(int serch){ //상세조회

        OrderDTO order = (OrderDTO) orderDB.getOrders().get(serch);
        return order;
    }

    public ArrayList OrderDetail() { //전체조회

        return orderDB.getOrders();
    }

}
