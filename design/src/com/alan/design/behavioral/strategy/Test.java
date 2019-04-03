package com.alan.design.behavioral.strategy;

public class Test {

//    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new LijianPromotionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
//
//        promotionActivity618.executePromotion();
//        promotionActivity1111.executePromotion();
//    }

    public static void main(String[] args) {

        String promotionKey = "LIJIAN";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStragegy(promotionKey));
        promotionActivity.executePromotion();

    }

}
