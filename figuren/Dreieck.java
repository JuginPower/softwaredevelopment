package figuren;


public class Dreieck extends Figur2D
{
    private double seiteA;
    private double seiteB;
    private double seiteC;

    public Dreieck(double a, double b, double c)
    {

        this.seiteA = a;
        this.seiteB = b;
        this.seiteC = c;
    }

    public double getUmfang() 
    {
        return this.seiteA + this.seiteB + this.seiteC;
    }

    public double getFlaeche()
    {
        return reduceToTwoDecimalPlacesDouble(this.seiteC / 2 * this.computeHoeheC());
    }

    private double computeHoeheC() {
        
        double s = (1/2) * (this.seiteA + this.seiteB + this.seiteC);
        return reduceToTwoDecimalPlacesDouble((2/this.seiteC) * (Math.sqrt((s * (s - this.seiteA) * (s - this.seiteB) * (s - this.seiteC)))));
    }

    @Override
    public String toString() {
        return "Type = " + "Figur.Figur2D.Dreieck;\n" + this.toStringUmfangFlaeche()
        + "Properties = [{double seiteA: " + this.seiteA + "},\n"+ "{double seiteB: " + this.seiteB
        + "},\n{double seiteC: " + this.seiteC + "}];\n";
    }
}