package com.alan.design.structural.facade;

public class Test {

    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T-shirt");

        GiftExchangeService giftExchangeService = new GiftExchangeService();

//        giftExchangeService.setPointPaymentService(new PointPaymentService());
//        giftExchangeService.setQualifyService(new QualifyService());
//        giftExchangeService.setShippingService(new ShippingService());

        giftExchangeService.giftExchange(pointsGift);


    }

}
