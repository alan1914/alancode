package com.alan.javabase.io;

import java.io.File;

/**
 * @author stone
 * @des TODO
 * @date 2018/12/6/006 14:10
 **/
public class CreateDir {
    public static void main(String[] args) {
        String dirname = "/project/lib/alancode";
        File d = new File(dirname);
        // mkdir() :  创建此抽象路径名指定的目录。
        // mkdirs() :  创建此抽象路径名指定的目录，包括创建必需但不存在的父目录。
        // 这里因为没有 该目录就使用了 mkdirs 同时 如果没有指定盘 默认是当前工程所在的盘
        d.mkdirs();
    }
}
