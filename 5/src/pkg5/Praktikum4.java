/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5;

/**
 *
 * @author Tholut Akhyar
 */
public class Praktikum4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bilangan = 7; 
        boolean prima = true; 
        for (int i=2; i <= (bilangan/2); i++) { 
            if ((bilangan % i) == 0) { 
                prima = false; 
                break; // menghentikan pengulangan 
            } 
        }
        if (prima) { 
            System.out.println(bilangan + " merupakan bilangan prima");
        } else { 
            System.out.println(bilangan + " bukan bilangan prima"); 
        }       

    }
    
}
