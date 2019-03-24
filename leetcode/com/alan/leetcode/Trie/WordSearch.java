package com.alan.leetcode.Trie;

/**
 * 79. WordSearch
 * Given a 2D board and a word, find if the word exists in the grid.
 * <p>
 * The word can be constructed from letters of sequentially adjacent cell,
 * where "adjacent" cells are those horizontally or vertically neighboring.
 * The same letter cell may not be used more than once.
 * <p>
 * Example:
 * <p>
 * board =
 * [
 * ['A','B','C','E'],
 * ['S','F','C','S'],
 * ['A','D','E','E']
 * ]
 * <p>
 * Given word = "ABCCED", return true.
 * Given word = "SEE", return true.
 * Given word = "ABCB", return false.
 * <p>
 * solution1: DFS
 *
 * @author stone
 **/
public class WordSearch {

    public static boolean exist(char[][] board, String word) {

        // 边界判断
        if (word == null || word.length() == 0) {
            return false;
        }

        char[] wordChar = word.toCharArray();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, wordChar, 0, i, j)) {
                    return true;
                }
            }

        }

        return false;
    }

    /**
     * 深度遍历
     * @param board
     * @param words
     * @param idx 当前字符 索引
     * @param x 位置 x
     * @param y 位置 y
     * @return
     */
    private static boolean dfs(char[][] board, char[] words, int idx, int x, int y) {

        // 如果当前相同元素的索引长度 等于 word 长度 返回 true
        if (idx == words.length) {
            return true;
        }

        // 判断是否越界
        if (x < 0 || x == board.length || y < 0 || y == board[0].length) {
            return false;
        }

        // 如果当前遍历到的元素 不等于 word[idx] 则返回错误
        if (board[x][y] != words[idx]) {
            return false;
        }

        // 将已经访问过的值标记为不能访问
        // 这里使用 位运算 异或 256（二进制 1111 1111）
        // 两次异或256 将得到原值
        board[x][y] ^= 256;
        boolean exists =
                dfs(board, words, idx + 1, x, y + 1) ||
                dfs(board, words, idx + 1, x, y - 1) ||
                dfs(board, words, idx + 1, x + 1, y) ||
                dfs(board, words, idx + 1, x - 1, y);
        board[x][y] ^= 256;

        return exists;
    }

    public static void main(String[] args) {
        char[][] board =
                {
                        {'A', 'B', 'C', 'E'},
                        {'S', 'F', 'C', 'S'},
                        {'A', 'D', 'E', 'E'}
                };
        System.out.println(exist(board, "ABCCED"));
        System.out.println(exist(board, "SEE"));
        System.out.println(exist(board, "ABCB"));


    }


}
