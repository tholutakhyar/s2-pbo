/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10;

/**
 *
 * @author Tholut Akhyar
 */
public class Kotak2 {
    double panjang;
    double lebar;
    double tinggi;
    
    // Mendefinisikan constructor dengan parameter
    Kotak2(double p, double l, double t) {
        panjang = p;

        lebar = l;
        tinggi = t;
    }
    
    double hitungVolume() {
        return (panjang * lebar * tinggi);
    }
}

class Praktikum2 {
    public static void main(String[] args) {
        Kotak2 k1, k2;

        k1 = new Kotak2(4, 3, 2);
        k2 = new Kotak2(6, 5, 4);
        System.out.println("Volume k1 = " + k1.hitungVolume());
        System.out.println("Volume k2 = " + k2.hitungVolume());
    }
}