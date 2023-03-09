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
        return Math.PI * Math.pow(this.radius, 2) * this.hoehe;
    }

    public double getOberflaeche()
    {
        return (2 * (Math.PI * Math.pow(this.radius, 2))) + (2 * Math.PI * this.radius * this.hoehe);
    }
}
