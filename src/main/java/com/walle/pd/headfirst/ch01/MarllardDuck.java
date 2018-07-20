package com.walle.pd.headfirst.ch01;

import com.walle.pd.headfirst.ch01.imls.FlyWithWings;
import com.walle.pd.headfirst.ch01.imls.Quack;

/**
 * Created by ljj on 2018/7/19.
 */
public class MarllardDuck extends Duck {
    public MarllardDuck(){
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("I am a real Marllard duck");
    }
}
