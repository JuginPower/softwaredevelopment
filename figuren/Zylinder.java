package figuren;

public class Zylinder extends Figur3D
{
    private double radius;
    private double hoehe;
    
    public Zylinder(double r, double h)
    {
        this.radius = r;
        this.hoehe = h;
    }

    public double getVolumen() 
    {
        return reduceToTwoDecimalPlacesDouble(Math.PI * Math.pow(this.radius, 2) * this.hoehe);
    }

    public double getOberflaeche()
    {
        return reduceToTwoDecimalPlacesDouble((2 * (Math.PI * Math.pow(this.radius, 2))) + (2 * Math.PI * this.radius * this.hoehe));
    }

    @Override
    public String toString() {
        return "Type = " + "Figur.Figur3D.Zylinder;\n" + this.toStringVolumenOberflaeche()
        + "Properties = [{double radius: " + this.radius + "},\n"+ "{double hoehe: " + this.hoehe + "}];\n";
    }
}
