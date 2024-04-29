package com.ohgiraffers.section04.understand.Auth;

import com.ohgiraffers.section04.understand.dto.MemberDTO;

public interface SnsAuth {

    boolean login(MemberDTO memberDTO);

}
