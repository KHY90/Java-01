package com.ohgiraffers.fakeDB;

import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderDB {

    private final ArrayList orders;
    public static OrderDB orderDB = new OrderDB();

    private OrderDB(){
        orders = new ArrayList();
        OrderDTO orderDTO = new OrderDTO("아메리카노", 3000, 5);
        orders.add(orderDTO);
    }

    public static OrderDB getInstance(){
        return orderDB;
    }

    public void setItem(OrderDTO orderDTO){
        orders.add(orderDTO);
    }

    public ArrayList getOrders(){
        return orders;
    }

}
