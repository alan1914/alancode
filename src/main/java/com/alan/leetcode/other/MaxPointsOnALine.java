package com.alan.leetcode.other;

/**
 * @author stone
 * @des 线上最大点数
 * @date 2018/12/29/029 17:07
 **/
public class MaxPointsOnALine {

    class Point {
        int x;
        int y;

        Point() {
            x = 0;
            y = 0;
        }

        Point(int a, int b) {
            x = a;
            y = b;
        }
    }

    public int maxPoints(Point[] points) {
        int length = points.length;
                    if (length <= 2) return length;
                    int x1, y1, x2, y2, x3, y3;
                    int dx1, dy1, dx2, dy2;
                    int max = 2;
                    for (int i = 0; i < length; i++) {
                        x1 = points[i].x;
                        y1 = points[i].y;
                        // 同线
                        int num = 1;
                        // 重合点数目
                        int temp = 0;
                        for (int j = i + 1; j < points.length; j++) {
                            x2 = points[j].x;
                            y2 = points[j].y;
                            dx1 = x2 - x1;
                            dy1 = y2 - y1;
                            if (dx1 == 0 && dy1 == 0) {
                                temp++;
                            } else {
                    num++;
                    for (int m = j + 1; m < points.length; m++) {
                        x3 = points[m].x;
                        y3 = points[m].y;
                        dx2 = x3 - x2;
                        dy2 = y3 - y2;
                        if (dx1 * dy2 == dx2 * dy1) {
                            num++;
                        }
                    }
                }
                if ((num + temp) > max) {
                    max = (num + temp);
                }
                num = 1;
            }

        }
        return max;
    }

}
