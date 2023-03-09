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
}
