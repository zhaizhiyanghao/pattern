package com.zzy.strategy;

public class Zhaoyun {


    public static void main(String[] args) {
        //拿出一个计策 实际上如果计策数量 根本不固定 ，
        //其实就是如果将来需要再来1000条计策 ，不用改Context 和 IStrategy 只需要添加自己的锦囊
        Context context = new Context(new OneStategy());
        context.operate();
    }
}
