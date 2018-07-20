package com.walle.pd.headfirst.ch01.imls;

import com.walle.pd.headfirst.ch01.interfaces.FlyBehavior;

/**
 * Created by ljj on 2018/7/20.
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I am flying");
    }
}
