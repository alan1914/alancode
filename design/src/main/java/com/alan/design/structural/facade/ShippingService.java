package com.alan.design.structural.facade;

public class ShippingService {

    public String shipGift(PointsGift pointsGift) {
        System.out.println(pointsGift.getName() + "开始物流");
        String shipOrderNo = "123";
        return shipOrderNo;
    }

}
