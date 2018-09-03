package com.zzy.strategy;

/**
 * 第一个计策
 */
public class TwoStategy implements IStrategy {

    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行!");
    }
}
