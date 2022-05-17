/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5;

/**
 *
 * @author Tholut Akhyar
 */
public class Praktikum3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5;
        int hasil = 0; 
        
        for (int i=1; i<=n; i++) { 
            hasil += i; 
            if (i != n) { 
                System.out.print(i + " + "); 
            } else { 
                System.out.print("= "); 
            } 
        }
        
        System.out.println(hasil);
    }
    
}
