package com.alan.effectivejava.chapter8;

/**
 * @author stone
 * @des 对称性冲突问题
 * @date 2018/12/5/005 11:07
 **/
public final class CaseInsensitiveString {

    private final String s;

    public CaseInsensitiveString(String s) {
        if (s == null) {
            throw new NullPointerException();
        }
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString) {
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        }
        // 为了解决对称性的问题 建议将下面于String 进行操作的代码删除
        if (o instanceof String) {
            return s.equalsIgnoreCase((String) o);
        }
        return false;
    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";

        // 注意 这里违反了 equals的对称性
        // 对称性 非null情况下 如果  y.equals(x) return true 则  x.equals(y) return true
        // cis 的 equals 知道要忽略大小写 但 s.equals 不知道
        boolean result1 = cis.equals(s);
        System.out.println(result1);
        boolean result2 = s.equals(cis);
        System.out.println(result2);
    }

}
