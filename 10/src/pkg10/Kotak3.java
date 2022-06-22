/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10;

/**
 *
 * @author Tholut Akhyar
 */
class Kotak3 {
    double panjang;
    double lebar;
    double tinggi;
}

class Praktikum3 {
    public static void main(String[] args) {
        double volume;
        Kotak3 k = new Kotak3();
        
        // Mengisikan nilai ke dalam data-data kelas Kotak
        k.panjang = 4;
        k.lebar = 3;
        k.tinggi = 2;
        
        // Menghitung isi/volume kotak
        volume = k.panjang * k.tinggi * k.lebar;
        
        // Menampilkan nilai volume ke layar monitor
        System.out.println("Volume kotak = " + volume);
    }
}