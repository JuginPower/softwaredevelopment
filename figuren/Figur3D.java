package figuren;

abstract class Figur3D extends Figur
{
    public abstract double getVolumen();
    public abstract double getOberflaeche();
    protected String toStringVolumenOberflaeche() {
        return "Volumen = " + this.getVolumen() +";\n"
        + "Oberfläche = " + this.getOberflaeche() + ";\n";
    }
}