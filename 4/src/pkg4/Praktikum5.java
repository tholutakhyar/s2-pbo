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
public class Praktikum5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bilangan = 4;
        if (bilangan < 0) {
            System.out.println(bilangan + " merupakan bilangan NEGATIF.");
        } else if (bilangan == 0) {
            System.out.println("Nilai yang dimasukkan adalah NOL");
        } else { // (bilangan > 0)
            System.out.println(bilangan + " merupakan bilangan POSITIF.");
        }
    }
    
}
