package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

import java.security.spec.RSAOtherPrimeInfo;

public class Application01 {
    public static void main(String[] args){

        ExceptionTest et = new ExceptionTest();

//        try {
//            et.checkEnoughMoney(100,200);
//            try{
//                et.checkEnoughMoney(100,-200);
//            }catch(Exception e){
//                System.out.println("정신 체려~~~~");
//            }
//        } catch (Exception e) {
//            System.out.println("상품 가격을 정수로 다시 입력해주세요.");
//        }


//        try{
//            et.checkEnoughMoney(-100,200);
//        }catch(PriceNegativeException e){
//            System.out.println("제품 가격이 음수");
//        }catch(MoneyNegativeException e){
//            System.out.println("가진 돈이 음수");
//        }catch (NotEnoughMoneyException e){
//            System.out.println("제품이 가진 돈 보다 비싸");
//        }catch(Exception e){
//            System.out.println("뭐든 에러");
//        }


//        try {
//            et.checkEnoughMoney(100, 200);
//            et.checkEnoughMoney(200, -200); // 여기서 오류가 발생하면 아래는 진행하지 않음
//            et.checkEnoughMoney(10, 200);
//        }catch(Exception e){
//            // Exception 은 모든 예외의 최상위 타입으로 아래의 예외를 검사하지 않음
//        } catch (PriceNegativeException e) {
//            System.out.println("제품의 가격이 음수일 수 없음");
//        } catch (MoneyNegativeException e) {
//            System.out.println("가진 돈이 음수일 수 없음");
//        } catch (NotEnoughMoneyException e) {
//            System.out.println("제품의 가격이 가진 돈보다 비쌈");
//        }

        try {
            et.checkEnoughMoney(100, 200);
            et.checkEnoughMoney(200, -200); // 여기서 오류가 발생하면 아래는 진행하지 않음
            et.checkEnoughMoney(10, 200);
        } catch (PriceNegativeException e) {
            System.out.println("제품의 가격이 음수일 수 없음");
        } catch (MoneyNegativeException e) {
            System.out.println("가진 돈이 음수일 수 없음");
        } catch (NotEnoughMoneyException e) {
            System.out.println("제품의 가격이 가진 돈보다 비쌈");
        }
        System.out.println("쇼핑 종료");
    }
}
