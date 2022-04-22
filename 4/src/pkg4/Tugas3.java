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
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 25, y = 10, z = 15;
        
        if ((x >= y) && (y >= z)) {
            System.out.println("z = " + z + "\ny = " + y + "\nx = " + x);
        } else if ((x >= z) && (z >= y)) {
            System.out.println("y = " + y + "\nz = " + z + "\nx = " + x);
        } else if ((y >= x) && (x >= z)) {
            System.out.println("z = " + z + "\nx = " + x + "\ny = " + y);
        } else if ((y >= z) && (z >= x)) {
            System.out.println("x = " + x + "\nz = " + z + "\ny = " + y);
        } else if ((z >= y) && (y >= x)) {
            System.out.println("x = " + x + "\ny = " + y + "\nz = " + z);
        } else if ((z >= x) && (x >= y)) {
            System.out.println("y = " + y + "\nx = " + x + "\nz = " + z);
        }
    }
    
}
