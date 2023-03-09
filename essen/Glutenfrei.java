package essen;

public class Glutenfrei extends Sonderbestellung {
    
    public Glutenfrei(Gericht gericht) 
    {
        super(gericht);
    }
    public String beschreibung()
    {
        return ", glutenfrei";
    }
}
