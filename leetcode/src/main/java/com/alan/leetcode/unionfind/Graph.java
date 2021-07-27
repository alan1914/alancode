package com.alan.leetcode.unionfind;

import java.util.LinkedList;

public class Graph { // 无向图
    private int v; // 顶点的个数
    private LinkedList<Integer> adj[]; // 邻接表

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            // 创建一个链表
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int s, int t) { // 无向图一条边存两次
        adj[s].add(t);
        adj[t].add(s);
    }

    // 返回顶点v的邻接表
    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        // A <-> B ; A <-> C ; A <-> D
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);

        // B <-> D
        graph.addEdge(1, 3);

        System.out.println(graph.adj(0));
        System.out.println(graph.adj(1));
        System.out.println(graph.adj(2));
        System.out.println(graph.adj(3));

    }
}
