package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {

        String name;

        private int hp;

        // 몬스터의 hp가 0보다 큰 값만 입력될 수 잇도록 하여 버그를 막고자함.
        public void setHp(int hp){ // setHp 시작
              if(hp > 0){
                      this.hp = hp;
              }else{
                      System.out.println("몬스터의 체력은 0보다 작을 수 없습니다.");
              }
        } // setHp종료

    public int getHp(){
            return this.hp;
    }
}
