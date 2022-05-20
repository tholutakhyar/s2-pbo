/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg6;

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
        
        int i = dari;
        
        do {
            int i2 = 2;
            boolean prima = true; 
            
            do {
                if ((i % i2) == 0) {
                    prima = false;
                    break;
                }
                
                i2++;
                
            } while( i2 <= (i/2) );
            
            if (i == 2) {
                prima = true;
            }
            
            if (prima && i != 0  && i != 1) { 
                System.out.print(i + ", ");
            }
            
            i++;
        } while (i < sampai);
    }
    
}
