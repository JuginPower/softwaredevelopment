/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

import java.util.ArrayList;

/**
 *
 * @author eugen
 */
public class KinoOperator {

    public static Kino belegenUndZeigen() {

        // Aufgabe a + b
        int percent = 25;
        Kino kinoObject = new Kino();
        kinoObject.sitzeBelegen(3, percent);
        String belegPlan = kinoObject.showBelegplan();
        System.out.println(belegPlan);
        return kinoObject;
    }

    public static Kino suchenUndBelegen(Kino kinoObject, int anzahlPlaetze) {

        boolean[][] belegplan = kinoObject.returnBelegplan();
        int firstAppearanceSpalte = 0;
        ArrayList<Integer> successIndexNums = new ArrayList<Integer>();

        for (int i = 0; i < belegplan.length; i++) {

            int counter = 0;
            ArrayList<Integer> indexes = new ArrayList<Integer>();

            for (int j = 0; j < belegplan[i].length; j++) {
                if (belegplan[i][j] == false && counter < anzahlPlaetze) {
                    indexes.add(j);
                    counter++;
                } else if (counter == anzahlPlaetze) {
                    firstAppearanceSpalte = i;
                    successIndexNums = indexes;

                    for (int reihenIndex : successIndexNums) {
                        belegplan[firstAppearanceSpalte][reihenIndex] = true;
                    }

                    kinoObject.setBelegplan(belegplan);
                    System.out.println(firstAppearanceSpalte);
                    return kinoObject;
                }
            }
        }
        throw new ArrayIndexOutOfBoundsException("No places in a row found.");
    }

    /*public static int suchenUndBelegen(Kino kinoObject, int anzahlPlaetze, int reihenindex) {
        
    }*/
}
