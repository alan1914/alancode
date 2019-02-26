package com.alan.leetcode.recursiondivideconquer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author stone
 * @des TODO
 * @date 2019/2/22/022 10:36
 **/
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        Set set = new HashSet();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String value = "(" + board[i][j] + ")";
                    if (!set.add(i + value) || !set.add(value + j) || !set.add(i/3 + value + j/3)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = {{'.', '.', '.', '.', '5', '.', '.', '1', '.'}, {'.', '4', '.', '3', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '3', '.', '.', '1'}, {'8', '.', '.', '.', '.', '.', '.', '2', '.'}, {'.', '.', '2', '.', '7', '.', '.', '.', '.'}, {'.', '1', '5', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '2', '.', '.', '.'}, {'.', '2', '.', '9', '.', '.', '.', '.', '.'}, {'.', '.', '4', '.', '.', '.', '.', '.', '.'}};
        ValidSudoku validSudoku = new ValidSudoku();
        boolean bool = validSudoku.isValidSudoku(board);
        System.out.println(bool);
    }

}
