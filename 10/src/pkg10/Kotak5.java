/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10;

/**
 *
 * @author Tholut Akhyar
 */
class Kotak5 {

    double panjang;
    double lebar;
    double tinggi;
    
    // Mendefinisikan method void (tidak mengembalikan nilai)
    void cetakVolume() {
        System.out.println("Volume kotak = " + (panjang * lebar * tinggi));
    }    
}

class Praktikum5 {
    public static void main(String[] args) {
        Kotak5 k1, k2, k3;
        
        // instansiasi objek
        k1 = new Kotak5();
        k2 = new Kotak5();
        k3 = new Kotak5();
        
        // mengisi data untuk objek k1
        k1.panjang = 4;
        k1.lebar = 3;
        k1.tinggi = 2;
        
        // mengisi data untuk objek k2
        k2.panjang = 6;
        k2.lebar = 5;
        k2.tinggi = 4;
        
        // mengisi data untuk objek k3
        k3.panjang = 8;
        k3.lebar = 7;
        k3.tinggi = 6;
        
        // memanggil method cetakVolume() untuk masing-masing objek
        k1.cetakVolume();
        k2.cetakVolume();
        k3.cetakVolume();
    }
}
