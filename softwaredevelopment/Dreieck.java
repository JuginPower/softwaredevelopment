package softwaredevelopment;


public class Dreieck extends Figur2D
{
    private double seiteA;
    private double seiteB;
    private double grundseite;
    private double hoehe;

    public Dreieck(double a, double b, double grundseite, double hoehe)
    {
        this.seiteA = a;
        this.seiteB = b;
        this.grundseite = grundseite;
        this.hoehe = hoehe;
    }
    public double getUmfang() 
    {
        return this.seiteA + this.seiteB + this.grundseite;
    }
    public double getFlaeche()
    {
        return this.grundseite / 2 * this.hoehe;
    }
}