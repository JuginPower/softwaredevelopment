package figuren;

public class Raute extends Figur2D 
{
    private double seiteE;
    private double seiteF;
    private double seiteA;

    public Raute(double e, double f, double a) 
    {
        this.seiteE = e;
        this.seiteF = f;
        this.seiteA = a;
    }

    public double getUmfang()
    {
        return 4 * this.seiteA;
    }

    public double getFlaeche()
    {
        return 0.5 * this.seiteE * this.seiteF;
    }

    @Override
    public String toString() {
        return "Type = " + "Figur.Figur3D.Raute;\n" + this.toStringUmfangFlaeche()
        + "Properties = [{double seiteE: " + this.seiteE + "} "+ "\n{double seiteF: " + this.seiteF;
    }
}
