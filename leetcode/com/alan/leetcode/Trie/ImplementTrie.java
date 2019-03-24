package com.alan.leetcode.Trie;

/**
 * 208. Implement Trie (Prefix Tree)
 * Implement a trie with insert, search, and startsWith methods.
 * <p>
 * Example:
 * Trie trie = new Trie();
 * <p>
 * trie.insert("apple");
 * trie.search("apple");   // returns true
 * trie.search("app");     // returns false
 * trie.startsWith("app"); // returns true
 * trie.insert("app");
 * trie.search("app");     // returns true
 *
 * @author stone
 **/
public class ImplementTrie {

    class TrieNode {
        // 26个字母 （a~z）
        TrieNode[] childrens = new TrieNode[26];
        boolean isWord;
        char val;

        TrieNode() {
        }

        TrieNode(char c) {
            this.val = c;
        }
    }

    private TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public ImplementTrie() {
        root = new TrieNode();
        root.val = ' ';
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        TrieNode temp = root;
        // 遍历字符串
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            // 如果 子节点中 没有存在该字符 则new 一个
            if(temp.childrens[c - 'a'] == null){
                temp.childrens[c - 'a'] = new TrieNode(c);
            }
            // 将子节点 替换为临时根节点
            temp = temp.childrens[c - 'a'];
        }
        // 遍历结束 当尾节点 标识尾 isWord = true
        temp.isWord = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        // 获取根节点
        TrieNode temp = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            // 如果 子节点中 没有存在该字符 则返回错误
            if(temp.childrens[c - 'a'] == null){
                return false;
            }
            // 将子节点 替换为临时根节点
            temp = temp.childrens[c - 'a'];
        }

        // 判断尾节点是否是单词
        return temp.isWord;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        // 获取根节点
        TrieNode temp = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            // 如果 子节点中 没有存在该字符 则返回错误
            if(temp.childrens[c - 'a'] == null){
               return false;
            }
            // 将子节点 替换为临时根节点
            temp = temp.childrens[c - 'a'];

        }
        return true;
    }


    public static void main(String[] args) {
        ImplementTrie trie = new ImplementTrie();

        trie.insert("apple");
        System.out.println(trie.search("apple"));   // returns true
        System.out.println(trie.search("app"));     // returns false
        System.out.println(trie.startsWith("app")); // returns true
        System.out.println(trie.startsWith("bb")); // returns false
        trie.insert("app");
        System.out.println(trie.search("app"));     // returns true
    }

}
