/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12_lingkaran;

/**
 *
 * @author Tholut Akhyar
 */
public class Hasil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        Tabung tabung = new Tabung();
        lingkaran.r = 8;
        tabung.r = lingkaran.r;
        tabung.tinggi = 3;
        
        System.out.println("Lingkaran");
        System.out.println("Jari - Jari Lingkaran: " + lingkaran.r);
        System.out.println("Phi Lingkaran: " + Math.PI);
        lingkaran.luas();
        lingkaran.keliling();
        
        System.out.println("\n\nTabung");
        System.out.println("Tinggi Tabung: " + tabung.tinggi);
        tabung.volume();
        tabung.luas();
    }
    
}
