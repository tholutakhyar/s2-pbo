/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12_lingkaran;

/**
 *
 * @author Tholut Akhyar
 */
public class Tabung extends Lingkaran {
    float tinggi;
    
    float volume() {
        // Math.pow untuk pemangkatan
        float volume = (float) Math.PI * (float) Math.pow(r, 2) * tinggi;
        System.out.println("Volume Tabung: " + volume);
        return volume;
    }
    
    float luas() {
        float luas = 2 * (float) Math.PI * r * (r + tinggi);
        System.out.println("Luas Tabung: " + luas);
        return luas;
    }
}
