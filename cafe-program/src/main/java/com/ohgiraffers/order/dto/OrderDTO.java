package com.ohgiraffers.order.dto;

public class OrderDTO {

    private String menuName;

    private int price;

    private int quantity;

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
        return "OrderDTO{" +
                "\n 메뉴 이름 = '" + menuName + '\'' +
                "\n 가격 = " + price +
                "\n 수량 = " + quantity +
                '}';
    }
}
