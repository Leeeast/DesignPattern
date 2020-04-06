package com.ldl.designpattern.observerpattern.demo1;

import java.util.Observable;
import java.util.Observer;

public class LiSi implements Observer {
    //首先李斯是个观察者，一旦韩非子有活动，他就知道，他要向老板汇报
    @Override
    public void update(Observable observable, Object o) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报...");
        this.reportToQiShihuang(o.toString());
    }

    //汇报给秦始皇
    public void reportToQiShihuang(String reportContext) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了-->" + reportContext);
    }
}
