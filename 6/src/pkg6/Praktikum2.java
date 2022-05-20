/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6;

/**
 *
 * @author Tholut Akhyar
 */
public class Praktikum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bilangan=5; // bilangan yang akan dihitung faktorialnya 
        int hasil=1; 
        System.out.print(bilangan + "! = "); 
        if (bilangan == 0) { 
            System.out.println(hasil); 
            System.exit(1); 
        } 
        int i=bilangan; 
        do { 
            System.out.print(i); 
            if (i != 1) { 
                System.out.print(" x "); 
            } else { 
                System.out.print(" = ");
            } 
            hasil *= i; // dapat ditulis: hasil = hasil * i; 
            i--; 
        } while (i >= 1); 
        System.out.println(hasil);
    }
    
}
