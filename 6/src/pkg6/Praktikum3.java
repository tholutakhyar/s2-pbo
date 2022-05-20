/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6;

/**
 *
 * @author Tholut Akhyar
 */
public class Praktikum3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=1, j; 
        do { 
            j=1;
            do { 
                System.out.print(i*j + " "); 
                j++;
            } while (j<=i);
            System.out.println();
            i++;
        } while (i<=5);

    }
    
}
