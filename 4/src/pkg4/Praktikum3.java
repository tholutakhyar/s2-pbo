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
public class Praktikum3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tahun = 2008;
        if ((tahun % 4 == 0) && ((tahun % 100 != 0) || (tahun % 400 == 0))) {
            System.out.println("Tahun " + tahun + " merupakan tahun kabisat.");
        }
    }
    
}
