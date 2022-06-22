/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10;

/**
 *
 * @author Tholut Akhyar
 */
class Kotak4 {
    double panjang;
    double lebar;
    double tinggi;
}

class Praktikum4 {
    public static void main(String[] args) {
        double volume1, volume2;
        Kotak4 k1 = new Kotak4(); // mendeklarasikan objek k1
        Kotak4 k2 = new Kotak4(); // mendeklarasikan objek k2
        
        // Mengisikan nilai ke dalam objek k1
        k1.panjang = 4;
        k1.lebar = 3;
        k1.tinggi = 2;
        
        // Mengisikan nilai ke dalam objek k2
        k2.panjang = 6;
        k2.lebar = 5;
        k2.tinggi = 4;
        
        // Menghitung isi/volume dari objek k1
        volume1 = k1.panjang * k1.tinggi * k1.lebar;

        // Menghitung isi/volume dari objek k2
        volume2 = k2.panjang * k2.tinggi * k2.lebar;
        
        // Menampilkan nilai volume k1 dan k2 ke layar monitor
        System.out.println("Volume k1 = " + volume1);
        System.out.println("Volume k2 = " + volume2);
    }
}