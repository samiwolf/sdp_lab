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
public class MainClass {
    public static void main(String[] args) {
        
        Duck mallardDuck = new MallardDuck();
      
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.flyBehavior.fly();
        
    }
    
}
