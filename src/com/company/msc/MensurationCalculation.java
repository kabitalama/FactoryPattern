/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.msc;

import java.util.Scanner;

/**
 *
 * @author Kabi
 */
public abstract class MensurationCalculation {
//abstract constructor requires abstract class

    protected Scanner input;
    private double length, breadth, height, radius;

    public MensurationCalculation() {

    }

    public abstract double calculate();
    
   
    public void setInput(Scanner input) {
        this.input = input; //it let's us to use Scanner for all classes.
    } 

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
