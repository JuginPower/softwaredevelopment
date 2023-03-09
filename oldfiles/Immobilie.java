/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author eugen
 */
public class Immobilie {
    
    private Adresse adresse;
    private int baujahr;
    private double grundstueckgroesse;
    private double wohnflaeche;
    private double kellerflaeche;
    private String heizungsanlage;
    
    public Immobilie(Adresse adresse, int baujahr, double grund, double wohn, 
            double keller, String heizung) {
        this.adresse = adresse;
        this.baujahr = baujahr;
        this.grundstueckgroesse = grund;
        this.wohnflaeche = wohn;
        this.kellerflaeche = keller;
        this.heizungsanlage = heizung;
    } 
    
    public double berrechneGesamtWohnflaeche() {
        
        return Math.round((this.wohnflaeche + this.kellerflaeche) * 100) / 100;
        
    }
}
