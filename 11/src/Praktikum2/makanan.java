/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum2;

/**
 *
 * @author Tholut Akhyar
 */
public class makanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat Instence/Objek dari Class restoran 
        restoran data = new restoran(); 

        //Memasukan Data pada Variable 
        data.setMenu("Ayam Goreng"); 
        data.setharga(17000.0); 
        data.setSpesial(true); 

        //Memanggil Method Get dari Class restoran dan Menampilkannya
        System.out.println("Menu Makanan: "+data.getMenu());
        System.out.println("Harga Makanan: Rp."+data.getHarga());
        System.out.println("Menu Spesial: "+data.getSpesial());
    }
    
}
