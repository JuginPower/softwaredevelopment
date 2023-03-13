package figuren;
import java.util.ArrayList;

public class Raum {
    public static void main(String[] args) 
    {    
        ArrayList<Figur> figures = new ArrayList<Figur>();
        
        Zylinder zylinder = new Zylinder(5.2, 10.6);
        Raute raute = new Raute(7.3, 3.4, 5.6);
        Quadrat quadrat = new Quadrat(4.0);
        Kugel kugel = new Kugel(5.6);
        Dreieck dreieck = new Dreieck(6.0, 7.0, 10.4);
        
        figures.add(raute);
        figures.add(zylinder);
        figures.add(quadrat);
        figures.add(kugel);
        figures.add(dreieck);

        System.out.println("Die Figuren:\n------------");
        alleFigurenAnzeigen(figures);

        System.out.println("Gesamtfläche aller 2D Figuren:\n------------------");
        System.out.println("-> " + gesamtFlaecheFigur2D(figures));

        System.out.println("Gesamtvolumen aller 3D Figuren:\n------------------");
        System.out.println("-> " + gesamtVolumenFigur3D(figures));
    }

    public static void alleFigurenAnzeigen(ArrayList<Figur> figurenListe)
    {
        for (Figur fig: figurenListe) {
            System.out.println(fig.toString());
        }
    }

    public static double gesamtFlaecheFigur2D(ArrayList<Figur> figurenListe)
    {
        double result = 0.0;

        for (Figur fig: figurenListe) {
            if (fig instanceof Figur2D) {
                Figur2D fig2D = (Figur2D)fig;
                result += fig2D.getFlaeche();
            }
        }
        return result;
    }

    public static double gesamtVolumenFigur3D(ArrayList<Figur> figurenListe)
    {
        double result = 0.0;

        for (Figur fig: figurenListe) {
            if (fig instanceof Figur3D) {
                Figur3D fig3D = (Figur3D)fig;
                result += fig3D.getOberflaeche();
            }
        }
        return result;
    }
}
