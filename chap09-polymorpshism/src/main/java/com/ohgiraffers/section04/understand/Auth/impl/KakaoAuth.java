package com.ohgiraffers.section04.understand.Auth.impl;

import com.ohgiraffers.section04.understand.Auth.SnsAuth;
import com.ohgiraffers.section04.understand.dto.MemberDTO;

public class KakaoAuth implements SnsAuth {

    @Override
    public boolean login(MemberDTO memberDTO){
        System.out.println("카카오 로그인 성공됨");
        return true;
    }
}
