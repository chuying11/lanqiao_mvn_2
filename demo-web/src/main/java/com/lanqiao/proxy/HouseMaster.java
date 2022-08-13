package com.lanqiao.proxy;

/**
 * 房东类
 */
public class HouseMaster implements ISale{
    /**
     * 售卖方法
     */
    public void sale(){
        System.out.println("我是房东，我的房子 3000元");
    }
}
