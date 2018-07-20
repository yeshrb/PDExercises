package com.walle.pd.headfirst.ch01.imls;

import com.walle.pd.headfirst.ch01.interfaces.QuackBehavior;

/**
 * Created by ljj on 2018/7/20.
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
