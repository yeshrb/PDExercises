package com.walle.pd.headfirst.ch01;

import com.walle.pd.headfirst.ch01.imls.FlyNoWay;
import com.walle.pd.headfirst.ch01.imls.MuteQuack;

/**
 * Created by ljj on 2018/7/20.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("I am a model duck");
    }
}
