/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12_persegi_panjang;

/**
 *
 * @author Tholut Akhyar
 */
public class PersegiPanjang {
    float panjang;
    float lebar;
    
    float luas() {
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
        return luas;
    }
    
    float keliling() {
        float keliling = 2 * panjang + 2 * lebar;
        System.out.println("Keliling Persegi Panjang: " + keliling);
        return keliling;
    }
}
