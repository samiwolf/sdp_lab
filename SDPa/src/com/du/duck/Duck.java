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
abstract class Duck {
    
    FlyBehavior flyBehavior;

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    QuackBehavior quackBehavior;

    public void quack() {
        System.out.println("Quacking");
    }

    public void swim() {
        System.out.println("Swimming");
    }
    
   
            

    abstract void display();
}




