/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6;

/**
 *
 * @author Tholut Akhyar
 */
public class Praktikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=5; // 5 buah bilangan positif pertama 
        int hasil=0; 
        int i=1;
        
        do { 
            System.out.print(i); 
            if (i != n) { 
                System.out.println(" + "); 
            } else { 
                System.out.println(" = "); 
            } 
            hasil += i; 
            i++; 
        } while (i <= n);
        
        System.out.println(hasil); 
    }
    
}
