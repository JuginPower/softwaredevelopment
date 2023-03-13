package figuren;

abstract class Figur2D extends Figur
{
    public abstract double getUmfang();
    public abstract double getFlaeche();
    protected String toStringUmfangFlaeche() {
        return "Umfang = " + this.getUmfang() + ";\n"
        + "Fläche = " + this.getFlaeche() + ";\n";
    }
}
