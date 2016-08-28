/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.msc;

/**
 *
 * @author Kabi
 */
public class Circle extends MensurationCalculation{

    @Override
    public double calculate() {
       double pie=22/7;
        System.out.println("Enter Radius:");
        setRadius(input.nextDouble());
        return pie*getRadius()*getRadius();
    }
    
}
