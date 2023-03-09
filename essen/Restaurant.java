package essen;

public class Restaurant {
    
    public static void main(String[] args) 
    {
        Hauptgericht haupt = new Hauptgericht();
        Vegetarisch veg = new Vegetarisch(haupt); // Warum klappt das nicht?

    }
}
