package com.lanqiao.proxy;

public class Test {
    public static void main(String[] args) {
        HouseMaster houseMaster = new HouseMaster();
        HouseMaster proxy = new LianProxy(houseMaster);
        proxy.sale();
    }
}
