package ArrayUebung;
import java.util.Random;
import java.util.ArrayList;


public class Zeiterfassung {
    
    public static void main(String[] args) {
        
        Random rnd = new Random(3);
        ArrayList<Zeitstempel> zeitArray = new ArrayList<>();
        
        for(int h=0; h<9; h++) {
            for(int m=0; m<60; m++) {
                int zufallMinute = rnd.nextInt(0, 60);
                if(m==zufallMinute) {
                    Zeitstempel zeitStempel = new Zeitstempel(h, m);
                    zeitArray.add(zeitStempel);
                }
            }
        }

        for (Zeitstempel zeit: zeitArray)
        {
            System.out.print(zeit.toString());
        }
    }
    
    /* public static Integer dauerLaengsteStosszeit(Zeitstempel[] zeitStempelArray) {
        
        ArrayList<Integer> dauerStosszeiten = new ArrayList<>();
        int currentMinute = 0;
        int dauer = 0;
        
        for(Zeitstempel zeitStempelObject:zeitStempelArray) {
            if(zeitStempelObject.minute == currentMinute) {
                dauer++;
            } else {
                dauerStosszeiten.add(dauer);
                dauer = 0;
            }
            if(currentMinute > 59) {
                currentMinute = 0;
            } else {
                currentMinute = zeitStempelObject.minute+1;
            }
        }
        return dauerStosszeiten.toArray();
    } */
}
