/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwaredevelopment;

/**
 *
 * @author eugen
 */
public class Vegetarisch extends Sonderbestellung {

    public Vegetarisch(Gericht gericht)
    {
        super(gericht); // Kann man muss man aber nicht
    }
    public String beschreibung() {
        
        return ", vegetarisch";
    }
}
