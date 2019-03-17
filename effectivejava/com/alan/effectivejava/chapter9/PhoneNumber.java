package com.alan.effectivejava.chapter9;

import java.util.HashMap;
import java.util.Map;

/**
 * @author stone
 * @des hashCode 测试
 * @date 2018/12/5/005 15:25
 **/
public class PhoneNumber {

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {
        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(lineNumber, 9999, "line number");
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    private static void rangeCheck(int arg, int max, String name) {
        if (arg < 0 || arg > max) {
            throw new IllegalArgumentException(name + ":" + arg);
        }
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }
        if (!(o instanceof PhoneNumber)) {
            return false;
        }
        PhoneNumber pn = (PhoneNumber) o;

        return pn.lineNumber == lineNumber
                && pn.prefix == prefix
                && pn.areaCode == areaCode;

    }

    @Override
    public int hashCode() {
        int result = 17;

        // 31 * i == (i << 5) - i;
        result = 31 * result + areaCode;
        result = 31 * result + prefix;
        result = 31 * result + lineNumber;
        return result;
    }

    public static void main(String[] args) {
        Map<PhoneNumber, String> m = new HashMap<PhoneNumber, String>();
        m.put(new PhoneNumber(707, 867, 5309), "jenny");



        // 添加 hashCode后 可以获取到该 value
        // 如果不添加 hashCode 方法 这里获取到的 value是null
        String result = m.get(new PhoneNumber(707, 867, 5309));
        System.out.println(result);


    }

}
