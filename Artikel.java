/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author kraft
 */
public class Artikel {
    
    private long artikelnummer;
    private String artikelname;
    private int warenbestand;
    private double einkaufspreis;
    private char warengruppe;
    private boolean auslaufartikel;
    
    public Artikel(int artikelnummer, String artikelname, int warenbestand, 
            double einkaufspreis, char warengruppe, boolean auslaufartikel) {
        this.artikelnummer = artikelnummer;
        this.artikelname = artikelname;
        this.warenbestand = warenbestand;
        this.einkaufspreis = einkaufspreis;
        this.warengruppe = warengruppe;
        this.auslaufartikel = auslaufartikel;
    }
    
    public String toString() {
        return "Artikelnummer: " + artikelnummer + "\nArtikelname: " + artikelname 
                + "\nWarenbestand: " + warenbestand + "\nEinkaufspreis: " + einkaufspreis
                + "\nWarengruppe: "+ warengruppe + "\nAuslaufartikel: " + auslaufartikel;
    }
    public long getArtikelnummer() {
        return this.artikelnummer;
    }
    public void setArtikelnummer(long newArtikelnummer) {
        this.artikelnummer = newArtikelnummer;
    }
}