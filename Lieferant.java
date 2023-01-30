/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author kraft
 */
public class Lieferant {
    
    private int id;
    private String name;
    private Adresse adresse;
    private Artikel artikel;
    
    public Lieferant(int id, String name, Adresse adresse, Artikel artikel) {
        
        this.id = id;
        this.name = name;
        this.adresse = adresse;
        this.artikel = artikel;
    }
    
    public String toString() {
        return "\nID: "+ this.id + "\nName: " + name + "\nAdresse: " + adresse 
                + "\nArtikel: " + artikel;
    }
}
