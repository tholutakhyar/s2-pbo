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
public class Perulangan_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("bilangan: ");
        int input_bilangan = input.nextInt();
        
        System.out.println("pencacah: ");
        int input_pencacah = input.nextInt();
        int result = input_bilangan;
        
        for (int i = 1; i < input_pencacah; i++) {
            result = result * input_bilangan;
        }
        
        System.out.println("hasil pangkat: " + result);
    }
    
}
