package essen;


public abstract class Sonderbestellung extends Gericht{
    
    public Gericht gericht;
    
    public Sonderbestellung(Gericht gericht) {
        
        this.gericht = gericht;
    }
}
