/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8;

/**
 *
 * @author Tholut Akhyar
 */
public class Praktikum4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] duaD = new int[2][3]; 
        int k = 1; 
        for(int i=0; i<2; i++) { 
            for (int j=0; j<3; j++) { 
                duaD[i][j] = k * 10; 
                System.out.print(duaD[i][j]); 
                System.out.print(" "); 
                //if (j < 2) System.out.print("\n"); 
                k++; 
            } 
            System.out.print("\n"); 
        } 
        System.out.println(); 
    }
    
}
