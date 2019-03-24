package com.alan.design.structural.decorator.adapter;

public class PowerAdapter implements DC5 {

    AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int in = ac220.outputAC220();

        // 转换
        // 变压器相关逻辑代码
        int output = in / 44;
        System.out.println("使用PowerAdapter输入电压:" + in + "V，输出电压:" + output);

        return output;
    }
}
