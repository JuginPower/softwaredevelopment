/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oldfiles;

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
