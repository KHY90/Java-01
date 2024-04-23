package com.ohgiraffers.section03.dto.problem02;

import java.util.ArrayList;

public class MemberRepository {

    ArrayList data = new ArrayList();

    public void addMember(MemberDTO member){
        data.add(member);
    }

    public void print(){
        System.out.println(this.data);
    }

}
