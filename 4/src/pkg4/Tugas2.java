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
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15, big = 0;
        String big_letter = "x";
        
        if (x > big) {
            big = x;
            big_letter = "x";
        }
        if (y > big) {
            big = y;
            big_letter = "y";
        }
        if (z > big) {
            big = z;
            big_letter = "z";
        }
        System.out.println("variabel yang nilainya besar adalah " + big_letter + " dengan nilai " + big);
    }
    
}
