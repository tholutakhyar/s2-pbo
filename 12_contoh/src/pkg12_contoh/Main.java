/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12_contoh;

/**
 *
 * @author Tholut Akhyar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat object bangun datar
        BangunDatar bangunDatar = new BangunDatar();
        
        // membuat object persegi dan mengisi nilai properti
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
        
        // membuat object lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
    
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;
        
        bangunDatar.luas();
        bangunDatar.keliling();
        persegi.luas();
        persegi.keliling();
        lingkaran.luas();
        lingkaran.keliling();
        persegiPanjang.luas();
        persegiPanjang.keliling();
        mSegitiga.luas();
        mSegitiga.keliling();
    }
    
}
