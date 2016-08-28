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
public class Perimeter extends MensurationCalculation {

    @Override
    public double calculate() {
        System.out.println("Enter Length:");
        setLength(input.nextDouble());

        System.out.println("Enter Breadth:");
        setBreadth(input.nextDouble());

        System.out.println("Enter Height:");
        setHeight(input.nextDouble());

        return getLength() + getBreadth() + getHeight();
    }

}
