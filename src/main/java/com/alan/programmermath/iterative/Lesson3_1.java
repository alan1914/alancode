package com.alan.programmermath.iterative;

/**
 * @author stone
 * @des TODO
 * @date 2018/12/17/017 11:15
 **/
public class Lesson3_1 {


    /**
     * 算算舍罕王给了多少粒麦子
     * @param grid 总网格数
     * @return
     */
    public static long getNumberOfWheat(int grid){

        // 总数
        long sum = 0;
        // 当前格子中麦粒的数量
        long numberOfWheatInGrid = 0;

        // 第一个格子里麦粒的数量
        numberOfWheatInGrid = 1;
        sum += numberOfWheatInGrid;

        for(int i = 2; i <= grid;i++){
            // 当前格子里麦粒的数量是前一格的 2 倍
            numberOfWheatInGrid *= 2;
            // 累计麦粒总数
            sum += numberOfWheatInGrid;
        }
        return sum;
    }

    public static void main(String[] args) {
        long sum = getNumberOfWheat(63);
        System.out.println(sum);
    }
}
