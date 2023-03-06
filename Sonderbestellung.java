/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school.softwaredevelopment;

/**
 *
 * @author eugen
 */
public abstract class Sonderbestellung implements Gericht{
    
    public Gericht gericht;
    
    public Sonderbestellung(Gericht gericht) {
        
        this.gericht = gericht;
    }
}
