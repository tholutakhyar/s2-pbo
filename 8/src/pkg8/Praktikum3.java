/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8;

/**
 *
 * @author Tholut Akhyar
 */
public class Praktikum3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] duaD = {{10,20,30},{40,50,60}}; 
        for(int i=0; i<2; i++) { 
            for (int j=0; j<3; j++) { 
                System.out.print(duaD[i][j]); 
                if (j < 2) System.out.print(" "); 
            } 
            System.out.println(); 
        }
    }
    
}
