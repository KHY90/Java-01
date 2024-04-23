package com.ohgiraffers.section02.encapsulation.problem2;

public class Application02 {
    public static void main(String[] args) {

        /*
        *  Book[] books = new Book[]
        *  books[0].name = "";
        * */

        Book[] books = new Book[5];

//        books[0].subject = "가";
//        books[1].subject = "나";
//        books[2].subject = "다";
//        books[3].subject = "라";
//        books[4].subject = "마";
//
//        books[0].writer = "사";
//        books[1].writer = "아";
//        books[2].writer = "자";
//        books[3].writer = "차";
//        books[4].writer = "카";
//
//        books[0].num = 10;
//        books[1].num = 11;
//        books[2].num = 12;
//        books[3].num = 13;
//        books[4].num = 14;

        Human human = new Human();

        human.name = "청명";
        human.books = books[0];

    }
}
