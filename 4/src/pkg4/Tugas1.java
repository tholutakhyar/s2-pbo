/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;

/**
 *
 * @author tx
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 5, y = 10, z;
        System.out.println("Sebelum ditukar x = " + x + " dan y = " + y);
        
        z = x;
        x = y;
        y = z;
        
        System.out.println("Sesudah ditukar x = " + x + " dan y = " + y);
    }
    
}
