/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6;

/**
 *
 * @author Tholut Akhyar
 */
public class Praktikum5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0; 
        while (i<10) { 
            if (i == 5) { 
                break; // keluar dari blok pengulangan 
            } 
            System.out.println("baris ke-" + i); 
            i++; 
        } 
        System.out.println("Statemen setelah blok pengulangan");
    }
    
}
