package com.alan.design.behavioral.strategy;

public class FanXianPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("返现促销，课程下单后返回金额到用户账号中");
    }
}
