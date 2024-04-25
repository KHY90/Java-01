package com.ohgiraffers.order.dto;

public class OrderDTO {

    private String menuName;

    private int price;

    private int quantity;

    private int total;

    public OrderDTO(){

    }

    public OrderDTO(String menuName, int price, int quantity){
        this.menuName = menuName;
        this.price = price;
        this.quantity = quantity;
        this.total = price * quantity;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity, int price) {

        this.quantity = quantity;
        this.price = quantity * price;
    }

    public int getPrice() {

        return price;
    }

    public String getMenuName() {

        return menuName;
    }

    public void setMenuName(String menuName) {

        this.menuName = menuName;
    }

    @Override
    public String toString() {
        return "{ " +
                "메뉴 이름 = '" + menuName + '\'' +
                ", 가격 = " + price +
                ", 수량 = " + quantity +
                ", 총 가격 = " + total +
                " }";
    }

}
