package com.ohgiraffers.section04.understand.Auth.impl;

import com.ohgiraffers.section04.understand.Auth.SnsAuth;
import com.ohgiraffers.section04.understand.dto.MemberDTO;

public class GoogleAuth implements SnsAuth {

    @Override
    public boolean login(MemberDTO memberDTO){
        System.out.println("구글로그인 성공됨");
        return true;
    }
}
