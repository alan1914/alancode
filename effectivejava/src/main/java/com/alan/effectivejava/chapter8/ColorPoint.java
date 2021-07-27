package com.alan.effectivejava.chapter8;

import java.awt.*;
import java.awt.Point;

/**
 * @author stone
 * @des TODO
 * @date 2018/12/5/005 11:26
 **/
public class ColorPoint extends Point {

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint)) {
            return false;
        }
        return super.equals(o) && ((ColorPoint) o).color == color;

    }
}
