/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayUebung;

/**
 *
 * @author eugen
 */
public class Zeitstempel {
    public int stunde;
    public int minute;
    
    public Zeitstempel(int stunde, int minute) {
        this.stunde = stunde;
        this.minute = minute;
    }

    @Override
    public String toString()
    {
        return "|" + this.stunde + "|" + "\n---\n" + "|" + this.minute + "|";
    }
}
