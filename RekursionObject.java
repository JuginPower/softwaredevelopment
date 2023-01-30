/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author kraft
 */
public class RekursionObject {

    static int countCommas(String text, int count) {
        if (text.equals("")) {
            return count;
        }
        if (text.charAt(0) == ',') {
            return countCommas(text.substring(1), count + 1);
        } else {
            return countCommas(text.substring(1), count);
        }
    }

    static int myCount(String text)

    {
        int counter = 0;
        for(int i=0; i<text.length(); i++) {
            if(text.charAt(i) == ',') {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        String myText = "Die Erde ist nicht rund, das ist der Gravitationskraft geschuldet, mehr wie ein ungeformter Klumpen";

        long before = System.nanoTime();
        int countOfCommas = countCommas(myText, 100);
        long duration = System.nanoTime() - before;

        System.out.println("Duration of the old method in nano seconds: " + duration);
        
        before = System.nanoTime();
        int myCounter = myCount(myText);
        duration = System.nanoTime() - before;
        
        System.out.println("Duration of the new method in nano seconds: " + duration);
    }
}
