package com.ldl.designpattern.observerpattern.demo1;

import java.util.Observable;


public class HanFeiZi extends Observable implements IHanFeiZi {
    //韩非子要吃饭了
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了...");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    //韩非子开始娱乐
    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");
    }
}
