/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6;

/**
 *
 * @author Tholut Akhyar
 */
public class Praktikum6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=0; i<10; i++) { 
            System.out.print(i + " "); 
            if (i % 2 == 0) { 
                continue; 
            } 
            System.out.println();
        }
    }
    
}
