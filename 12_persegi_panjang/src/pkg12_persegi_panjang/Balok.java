/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12_persegi_panjang;

/**
 *
 * @author Tholut Akhyar
 */
public class Balok extends PersegiPanjang {
    float tinggi;
    
    float volume() {
        float volume = tinggi * panjang * lebar;
        System.out.println("Volume Balok: " + volume);
        return volume;
    }
    
    float luas() {
        float luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        System.out.println("Luas Balok: " + luas);
        return luas;
    }
    
    float keliling() {
        float keliling = 4 * (panjang + lebar + tinggi);
        System.out.println("Keliling Balok: " + keliling);
        return keliling;
    }
}
