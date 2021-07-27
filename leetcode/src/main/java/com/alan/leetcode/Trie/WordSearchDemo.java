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
 * <p>
 * solution2: Tire
 *
 * @author stone
 **/
public class WordSearchDemo {

    public static boolean exist(char[][] board, String word) {

        if (word == null || word.length() == 0) {
            return true;
        }
        char[] chs = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, chs, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, char[] words, int idx, int x, int y) {
        if (idx == words.length) {
            return true;
        }
        if (x < 0 || x == board.length || y < 0 || y == board[0].length) {
            return false;
        }
        if (board[x][y] != words[idx]) {
            return false;
        }
        board[x][y] ^= 256;
        boolean exist =
                dfs(board, words, idx + 1, x, y + 1) ||
                dfs(board, words, idx + 1, x, y - 1) ||
                dfs(board, words, idx + 1, x + 1, y) ||
                dfs(board, words, idx + 1, x - 1, y);
        board[x][y] ^= 256;
        return exist;
    }

    public static void main(String[] args) {
        char[][] board =
                {
                        {'A', 'B', 'C', 'E'},
                        {'S', 'F', 'C', 'S'},
                        {'A', 'D', 'E', 'E'}
                };
//        System.out.println( exist(board,"A"));
//        System.out.println( exist(board,"AB"));
//        System.out.println( exist(board,"G"));
        System.out.println( exist(board,"ES"));
//        System.out.println( exist(board,"ABCCED"));
//        System.out.println( exist(board,"SEE"));


    }


}
