package com.zzy.strategy;

/**
 * 锦囊 ，我并不知道锦囊要干啥，但是锦囊是可以打开的
 */
public class Context {
    //打开锦囊算是一个操作，用接口表示
    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void operate() {
        this.iStrategy.operate();
    }

}
