package softwaredevelopment;

public class Kugel extends Figur3D
{
    private double radius;
    
    public Kugel(double r)
    {
        this.radius = r;
    }

    public double getVolumen() 
    {
        return 4 / 3 * Math.PI * Math.pow(this.radius, 3);

    }

    public double getOberflaeche()
    {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }
}
