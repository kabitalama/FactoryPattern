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
public class MensurationCalulationFactory {

    public static MensurationCalculation get(int param) {
        if (param == 1) {
            return new Area();
        } else if (param == 2) {
            return new Cube();
        } else if (param == 3) {
            return new Perimeter();
        } else if (param == 4) {
            return new Circle();
        } else if (param == 5) {
            return new Volume(); //conneting on a particular reqd place.
        }

        return null;
    }
}
