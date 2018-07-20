package com.walle.pd.headfirst.ch01;

import com.walle.pd.headfirst.ch01.interfaces.FlyBehavior;
import com.walle.pd.headfirst.ch01.interfaces.QuackBehavior;

/**
 * Created by ljj on 2018/7/19.
 */
public abstract class Duck  {
    FlyBehavior flyBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    QuackBehavior quackBehavior;

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public  void performQuack(){
        quackBehavior.quack();
    }
    public  void swim(){
        System.out.println("swiming");
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public abstract void display();
}
