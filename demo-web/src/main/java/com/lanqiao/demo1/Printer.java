package com.lanqiao.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


@Component("printer")
public class Printer {
    @Value("${company}")
    private List<String> company;//生产产家
    private String [] addres;//产地
    private Map<String,String> proxy;//代理点
    @Autowired
    @Qualifier("a3")
    private Paper paper;//纸张组件
//    @Autowired
//    @Qualifier("black")
    @Resource(name = "color")
    private Ink ink;//墨盒组件

    public Paper getPaper() {
        return paper;
    }

    public Printer() {
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }
    public void setCompany(List<String> company) {
        this.company = company;
    }

    public void setAddres(String[] addres) {
        this.addres = addres;
    }

    public void setProxy(Map<String, String> proxy) {
        this.proxy = proxy;
    }

    public Printer(Paper paper, Ink ink) {
        this.paper=paper;
        this.ink=ink;
    }

    //打印机打印方法
    public void working(){
        paper.writer();
        ink.print();
        System.out.println(Arrays.toString(this.addres));
        System.out.println(this.company);
        System.out.println(this.proxy);

    }
}

//A3纸张

/**
 * 声明一个bean 等于<bean id="a3" class="com.lanqiao.demo1.A3></bean>
 */
@Component("a3")
class A3 implements Paper{

    @Override
    public void writer() {
        System.out.println("A3在工作");
    }
}
//A4纸张
@Component("a4")
class A4 implements Paper{

    @Override
    public void writer() {
        System.out.println("A4在工作");
    }
}

//墨盒接口
interface Ink{
    //墨盒打印
    void print();
}
//黑色墨盒
@Component("black")
class BlackBox implements Ink{

    @Override
    public void print() {
        System.out.println("黑色墨盒在打印");
    }
}
//彩色墨盒
@Component("color")
class ColorBox implements Ink{

    @Override
    public void print() {
        System.out.println("彩色墨盒在打印");
    }
}

