/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school.softwaredevelopment;
import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author eugen
 */
public class Zeiterfassung {
    
    public static void main(String[] args) {
        
        Random rnd = new Random(3);
        ArrayList<Zeitstempel> zeitArray = new ArrayList<>();
        
        for(int h=0; h<13; h++) {
            for(int m=0; m<60; m++) {
                int zufallGruppe = rnd.nextInt(0, 60);
                if(m==zufallGruppe) {
                    Zeitstempel zeitStempel = new Zeitstempel(h, m);
                    zeitArray.add(zeitStempel);
                }
            }
        }
    }
    
    public static Integer dauerLaengsteStosszeit(Zeitstempel[] zeitStempelArray) {
        
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
    }
}
