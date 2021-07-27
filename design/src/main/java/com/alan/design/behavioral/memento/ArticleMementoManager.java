package com.alan.design.behavioral.memento;

import java.util.Stack;

public class ArticleMementoManager {

    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<>();

    public ArticleMemento getMemento() {
        ArticleMemento articleMemento = ARTICLE_MEMENTO_STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento artivleMemeto) {
        ARTICLE_MEMENTO_STACK.push(artivleMemeto);
    }

}
