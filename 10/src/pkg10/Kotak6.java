/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10;

/**
 *
 * @author Tholut Akhyar
 */
class Kotak6 {

    double panjang;
    double lebar;
    double tinggi;
    
    // Mendefinisikan method yang mengembalikan tipe double
    double hitungVolume() {
        // menghitung volume
        double vol = panjang * lebar * tinggi;
        // mengembalikan nilai
        return vol;
    }
    
}

class Praktikum6 {
    public static void main(String[] args) {
        Kotak6 k1, k2, k3;
        k1 = new Kotak6();
        k2 = new Kotak6();

        k3 = new Kotak6();
        k1.panjang = 4;
        k1.lebar = 3;
        k1.tinggi = 2;
        k2.panjang = 6;
        k2.lebar = 5;
        k2.tinggi = 4;
        k3.panjang = 8;
        k3.lebar = 7;
        k3.tinggi = 6;
        System.out.println("Volume k1 = " + k1.hitungVolume());
        System.out.println("Volume k2 = " + k2.hitungVolume());
        System.out.println("Volume k3 = " + k3.hitungVolume());
    }
}
