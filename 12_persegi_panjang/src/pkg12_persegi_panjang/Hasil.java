/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12_persegi_panjang;

/**
 *
 * @author Tholut Akhyar
 */
public class Hasil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Balok balok = new Balok();
        persegiPanjang.lebar = 12;
        persegiPanjang.panjang = 10;
        balok.tinggi = 6;
        balok.lebar = persegiPanjang.lebar;
        balok.panjang = persegiPanjang.panjang;
        
        System.out.println("Persegi Panjang");
        System.out.println("Lebar Persegi Panjang: " + persegiPanjang.lebar);
        System.out.println("Panjang Persegi Panjang: " + persegiPanjang.panjang);
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        System.out.println("\n\nBalok");
        System.out.println("Tinggi Balok: " + balok.tinggi);
        balok.luas();
        balok.volume();
        balok.keliling();
    }
    
}
