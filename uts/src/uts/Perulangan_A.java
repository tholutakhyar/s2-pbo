/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author Tholut Akhyar
 */
public class Perulangan_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("masukan angka: ");
        int input_angka = input.nextInt();
        int result = 0;
        boolean is_done = false;
        
        for (int i = 1; i <= input_angka + 1; i++) {
            if (is_done == false) {
                result += i;
                if (i != input_angka) { 
                    System.out.print(((input_angka + 1) - i) + " + "); 
                } else { 
                    System.out.print("1 = " + result + "\n"); 
                    is_done = true;
                }
            }
        }
    }
    
}
