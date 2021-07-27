package com.alan.design.structural.facade;

public class PointPaymentService {

    public boolean pay(PointsGift pointsGift) {
        // 扣减积分
        System.out.println("支付" + pointsGift.getName() + "成功");
        return true;
    }

}
