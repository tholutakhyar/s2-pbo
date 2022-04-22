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
public class Tugas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // penanganan error pada java menggunakan exception, ketika ada code yang error maka akan mengeluarkan output tentang errornya, contoh error yang index arraynya tidak ada.
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[3]);
        } catch (Exception e) {
            System.out.println("error: " + e);
        }
    }
    
}
