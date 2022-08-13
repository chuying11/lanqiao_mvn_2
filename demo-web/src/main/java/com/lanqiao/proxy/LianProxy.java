package com.lanqiao.proxy;

/**
 * 链家代理
 * 如果房东没有接口  就继承房东 充当房东的儿子
 */
public class LianProxy extends HouseMaster{


    private HouseMaster houseMaster;
    public LianProxy(HouseMaster houseMaster) {
        this.houseMaster = houseMaster;
    }

    /**
     * 必须和目标方法名一致
     */
    @Override
    public void sale() {
        System.out.println("我妈妈出国了，房子5000元");

    }
}
