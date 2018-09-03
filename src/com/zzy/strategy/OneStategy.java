package com.zzy.strategy;

/**
 * 第一个计策
 */
public class OneStategy implements IStrategy {

    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力!");
    }
}
