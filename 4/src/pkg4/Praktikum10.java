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
public class Praktikum10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=2;
        int b;
        switch(a) {
            case 1: b = a + 1;
            case 2: b = a + 2;
            case 3: b = a + 3;
            case 4: b = a + 4;
            case 5: b = a + 5;
            default: b = 0;
        }
        System.out.println("Nilai b: " + b);
    }
    
}
