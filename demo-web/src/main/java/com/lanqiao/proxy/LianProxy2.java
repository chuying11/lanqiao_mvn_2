package com.lanqiao.proxy;

public class LianProxy2 implements ISale{
    private HouseMaster master;

    public LianProxy2(HouseMaster houseMaster) {
    }

    @Override
    public void sale() {
        System.out.println("我是房东的兄弟");
    }
}
