/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10;

/**
 *
 * @author Tholut Akhyar
 */
public class Kotak7 {
    double panjang;
    double lebar;
    double tinggi;
    
    // Mendefinisikan method dengan parameter
    void isiData(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    double hitungVolume() {
        return (panjang * lebar * tinggi);
    }   
}

class Praktikum7 {
    public static void main(String[] args) {
        Kotak7 k;
        
        // Instansiasi objek
        k = new Kotak7();
        
        // Memanggil method isiData()
        k.isiData(4,3,2);
        System.out.println("Volume kotak = " + k.hitungVolume());
    }
}