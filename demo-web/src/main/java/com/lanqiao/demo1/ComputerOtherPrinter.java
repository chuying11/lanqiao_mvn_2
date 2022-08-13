package com.lanqiao.demo1;

public class ComputerOtherPrinter {
    private Paper paper;
    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void work(){
        paper.writer();
    }
}
