package com.ldl.designpattern.observerpattern.demo1;

import java.util.Observer;

public class Client {
    public static void main(String[] args) {
        //三个观察者生产出来
        Observer liSi = new LiSi();
        LiSi wangSi = new LiSi();
        LiSi liuSi = new LiSi();

        //定义韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();
        //有人在观察韩非子
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);

        //韩非子吃饭，活动
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
