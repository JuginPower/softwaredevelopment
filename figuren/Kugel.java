package figuren;

public class Kugel extends Figur3D
{
    private double radius;
    
    public Kugel(double r)
    {
        this.radius = r;
    }

    public double getVolumen() 
    {
        return this.reduceToTwoDecimalPlacesDouble(4 / 3 * Math.PI * Math.pow(this.radius, 3));

    }

    public double getOberflaeche()
    {
        return this.reduceToTwoDecimalPlacesDouble(4 * Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public String toString() {
        return "Type = " + "Figur.Figur3D.Kugel;\n" + this.toStringVolumenOberflaeche()
        + "Properties = [{double radius: " + this.radius + "}];\n";
    }
}
