package essen;


public class Vegetarisch extends Sonderbestellung {

    public Vegetarisch(Gericht gericht)
    {
        super(gericht); // Muss man wenn es sich nicht um einen Default Konstruktor handelt.
    }
    public String beschreibung() {
        
        return ", vegetarisch";
    }
}
