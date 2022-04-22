/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;

/**
 *
 * @author tx
 */
public class Praktikum6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char nilaiIndeks;
        double nilaiUTS, nilaiUAS, nilaiAkhir;
        // contoh data yang dimasukkan
        nilaiUTS = 75.0;
        nilaiUAS = 60.0;
        // menghitung nilai akhir menggunakan rumus di atas
        nilaiAkhir = (0.4 * nilaiUTS) + (0.6 * nilaiUAS);
        if (nilaiAkhir >= 80) {
            nilaiIndeks = 'A';
        } else if (nilaiAkhir >= 70) {
            nilaiIndeks = 'B';
        } else if (nilaiAkhir >= 50) {
            nilaiIndeks = 'C';
        } else if (nilaiAkhir >= 30) {
            nilaiIndeks = 'D';
        } else { // (nilaiAkhir < 30)
            nilaiIndeks = 'E';
        }
        System.out.println("Nilai Akhir\t: " + nilaiAkhir);
        System.out.println("Nilai Indeks\t: " + nilaiIndeks);
    }
    
}
