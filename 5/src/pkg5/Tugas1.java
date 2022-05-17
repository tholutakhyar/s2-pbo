/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5;

/**
 *
 * @author Tholut Akhyar
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dari = 0;
        int sampai = 12;
        
        for (int i = dari; i <= sampai; i++) {
            int bilangan = i;
            boolean prima = true; 
            
            for (int i2 = 2; i2 <= (bilangan/2); i2++) { 
                if ((bilangan % i2) == 0) { 
                    prima = false; 
                    break;
                } 
            }
            
            if (prima && bilangan != 0  && bilangan != 1) { 
                System.out.print(bilangan + ", ");
            }

        }
    }
    
}
