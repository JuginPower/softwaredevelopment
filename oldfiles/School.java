/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package oldfiles;

;

/**
 *
 * @author eugen
 */
public class School {

    public static void main(String[] args) {

        // int percent = Integer.parseInt(args[0]);
        int percent = 25;
        Kino myKino = new Kino();

        // Aufgabe a+b
        
        Kino currentKino = KinoOperator.belegenUndZeigen(myKino, percent);
        
        // Aufgabe c
        
        Kino currentKino2 = KinoOperator.suchenUndBelegen(currentKino, 3);
        
        String newPlan = currentKino2.showBelegplan();
        System.out.println("That´s the new Plan:\n" + newPlan);
        
        // KinoOperator.suchenUndBelegen(myKino, 3, 7);
    }
}
