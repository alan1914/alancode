package com.alan.design.structural.facade;

public class GiftExchangeService {


    private PointPaymentService pointPaymentService = new PointPaymentService();

    private QualifyService qualifyService = new QualifyService();

    private ShippingService shippingService = new ShippingService();

//    public void setPointPaymentService(PointPaymentService pointPaymentService) {
//        this.pointPaymentService = pointPaymentService;
//    }
//
//    public void setQualifyService(QualifyService qualifyService) {
//        this.qualifyService = qualifyService;
//    }
//
//    public void setShippingService(ShippingService shippingService) {
//        this.shippingService = shippingService;
//    }


    public void giftExchange(PointsGift pointsGift){
        // 判断是否合格
        if(qualifyService.isAvailable(pointsGift)){
            // 判断是否支付
            if(pointPaymentService.pay(pointsGift)){
                // 物流信息
                shippingService.shipGift(pointsGift);
            }
        }

    }
}
