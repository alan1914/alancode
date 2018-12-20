package com.alan.programmermath.mathematicalinduction;

/**
 * @author stone
 * @des 数学归纳法
 * @date 2018/12/20/020 9:02
 **/
public class Lesson4_2 {

    /**
     * 使用函数的递归（嵌套）调用，进行数学归纳法证明
     *
     * @param k      放到第几格
     * @param result 当前格子麦粒 和 麦粒总数
     * @return
     */
    public static boolean prove(int k, Result result) {

        // 判断当 n = 1,命题成立
        if (k == 1) {
            if (Math.pow(2, 1) - 1 == 1) {
                result.wheatNum = 1;
                result.wheatTotalNum = 1;
                return true;
            } else {
                return false;
            }
        }
        // 如果 n = (k-1) 时命题成立，证明 n = k 时命题成立
        boolean proveOfPreviousOne = prove(k - 1, result);
        result.wheatNum *= 2;
        result.wheatTotalNum += result.wheatNum;
        boolean proveOfCurrentOne = false;
        if (result.wheatTotalNum == (Math.pow(2, k) - 1)) {
            proveOfCurrentOne = true;
        }

        if (proveOfPreviousOne && proveOfCurrentOne) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int grid = 63;
        Result result = new Result();
        System.out.println(prove(63, result));
    }

}
