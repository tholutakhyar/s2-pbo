/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10;

/**
 *
 * @author Tholut Akhyar
 */

public class Kotak {
    double panjang;
    double lebar;
    double tinggi;
    
    Kotak() {
        panjang = 4;
        lebar = 3;
        tinggi = 2;
    }
    
    double hitungVolume() {
        return (panjang * lebar * tinggi);
    }
}

class Praktikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kotak k1, k2;
        k1 = new Kotak();
        k2 = new Kotak();
        System.out.println("Volume k1 = " + k1.hitungVolume());
        System.out.println("Volume k2 = " + k2.hitungVolume());
    }
    
}
