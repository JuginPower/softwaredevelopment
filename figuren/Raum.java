package figuren;
import java.util.ArrayList;

public class Raum {
    public static void main(String[] args) 
    {    
        ArrayList<Figur> figures = new ArrayList<Figur>();
        
        Zylinder zyl = new Zylinder(5.2, 10.6);
        Raute raut = new Raute(7.3, 3.4, 5.6);
        
        figures.add(raut);
        figures.add(zyl);

        alleFigurenAnzeigen(figures);
    }

    public static void alleFigurenAnzeigen(ArrayList<Figur> figs)
    {
        for (Figur fig: figs) {
            System.out.println(fig.toString());
        }
    }
}
