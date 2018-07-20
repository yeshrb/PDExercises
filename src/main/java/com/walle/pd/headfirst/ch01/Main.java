package com.walle.pd.headfirst.ch01;

import com.walle.pd.headfirst.ch01.imls.FlyRocketPowered;

/**
 * Created by ljj on 2018/7/19.
 */
public class Main {
    public static void main(String[] args) {
        Duck marllard = new MarllardDuck();
        marllard.performQuack();
        marllard.performFly();
        marllard.display();

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.display();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
