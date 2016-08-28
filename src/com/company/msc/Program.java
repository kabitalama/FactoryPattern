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
public class Program {

    /**
     * Factory Pattern Example
     */
    public static void main(String[] args) {
        //creating Menu; 
        Scanner input = new Scanner(System.in);
        System.out.println("1. Area");
        System.out.println("2. Cube");
        System.out.println("3. Perimeter");
        System.out.println("4. Circle");
        System.out.println("5. Volume");
        System.out.println("Enter your Choice[1-5]");
        MensurationCalculation calc = MensurationCalulationFactory.get(input.nextInt());
        if(calc!=null){
            calc.setInput(input);
            System.out.println("Output is :" +calc.calculate());
        }
    }

}
