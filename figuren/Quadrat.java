package figuren;

public class Quadrat extends Figur2D
{
    private double seiteA;
    
    public Quadrat(double a)
    {
        this.seiteA = a;
    }

    public double getUmfang() 
    {
        return 4 * this.seiteA;    
    }

    public double getFlaeche() 
    {
        return this.seiteA * this.seiteA;
    }

    @Override
    public String toString() {
        return "Type = " + "Figur.Figur2D.Quadrat;\n" + this.toStringUmfangFlaeche()
        + "Properties = [{double seiteA: " + this.seiteA + "}];\n";
    }
}
