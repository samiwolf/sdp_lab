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
public class RubberDuck extends Duck{

    @Override
    void display() {
        System.out.println("I am rubber duck. How am I talking?");
    }
    
    @Override
    public void quack()
    {
        System.out.println("Shhhhhhhhhhhhhhhhhh");
    }
    
}
