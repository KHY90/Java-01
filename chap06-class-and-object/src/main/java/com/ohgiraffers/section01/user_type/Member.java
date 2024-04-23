package com.ohgiraffers.section01.user_type;

import java.util.Arrays;

public class Member {

    String id;

    String name;

    String pwd;

    int age;

    char gender;

    String[] hobby;

    @Override
    public String toString() {
        return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + '\n' + "hobby=" + Arrays.toString(hobby);

    }

}
