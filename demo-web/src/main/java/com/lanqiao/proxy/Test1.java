package com.lanqiao.proxy;

public class Test1 {
    public static void main(String[] args) {
        HouseMaster houseMaster = new HouseMaster();
        ISale proxy2 = new LianProxy2(houseMaster);
        proxy2.sale();
    }
}
