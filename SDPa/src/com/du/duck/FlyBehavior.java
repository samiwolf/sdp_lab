/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.duck;

/**
 *
 * @author samiul_siddiqui
 */
public interface FlyBehavior {

    void fly();
}

interface QuackBehavior {

    void quack();
}

class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

}

class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {

        System.out.println("I can not fly");
    }

}


class Quack implements QuackBehavior{

    @Override
    public void quack() {
        
        System.out.println("QUACK");
    }
    
}


class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        
        System.out.println("Squeak only");
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class MuteDuck implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("No quack"); 
    }
    
}