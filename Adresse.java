/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author kraft
 */
public class Adresse {
    
    private String strasse;
    private int hausnummer;
    private int postleitzahl;
    private String stadt;
    
    public Adresse(String strasse, int hausnummer, int plz, String stadt) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.postleitzahl = plz;
        this.stadt = stadt;
    }
    
    public String toString() {
        return "\nStraße: "+ this.strasse + " " + this.hausnummer +
                "\nPostleitzahl: " + this.postleitzahl + "\nStadt: " +this.stadt;
    }
}
