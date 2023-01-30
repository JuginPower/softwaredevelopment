/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;
import java.util.Random;
/**
 *
 * @author 3000000053553
 */
public class Kino {
    
    private boolean[][] kinosaal = new boolean[9][30];
    
    public Kino() {
        
        for(int i=0; i<this.kinosaal.length; i++) {
            for(int j=0; j<this.kinosaal[i].length; j++) {
                this.kinosaal[i][j] = false;
            }
        }
    }
    
    public void sitzeBelegen(int seed, int percent) {
        
        Random rnd = new Random(seed);
        int gesamtzahl = 9*30;
        int anteilPerReihe = Math.round((gesamtzahl/100*percent)/9);
        
        for(int i=0; i<this.kinosaal.length; i++) {
            int counter = 0;
            for(int j=0; j<this.kinosaal[i].length; j++) {
                int zufallIndex = rnd.nextInt(this.kinosaal[i].length);
                if(counter < anteilPerReihe) {
                    this.kinosaal[i][zufallIndex] = true;
                    counter ++;
                }
            }
        }
    }
    
    public String showBelegplan() {
        String answer = "";
        int counter = 0;
        for(int i=0; i<this.kinosaal.length; i++) {
            for(int j=0; j<this.kinosaal[i].length; j++) {
                if(j>9 && counter>0) {
                    answer += "\s";
                }
                if(counter==0){
                    answer += Integer.toString(j)+"|";
                } else if(j==0 && counter>0) {
                 answer += Integer.toString(counter)+"|";
                } else if(j>0 && counter>0) {
                    if(this.kinosaal[i][j] == true) {
                        answer += "t|";
                    } else if(this.kinosaal[i][j] == false) {
                        answer += "f|";
                    }
                }
            }
            answer += "\n";
            counter ++;   
        }
        return answer;
    }
    
    public boolean[][] returnBelegplan() {
        return this.kinosaal;
    }
    
    public void setBelegplan(boolean[][] newBelegplan) {
        this.kinosaal = newBelegplan;
    }
}
