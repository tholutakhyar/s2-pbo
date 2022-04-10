/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

import java.util.Scanner; // untuk input

/**
 *
 * @author tx
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lakukanlah editing pada program praktikum 2 (Operator Modulus) dimana variable a dan b di inputkan oleh user ! 
        Scanner ia = new Scanner(System.in);
        System.out.println("Masukan nilai a: ");
        int a=ia.nextInt();
        
        Scanner ib = new Scanner(System.in);
        System.out.println("Masukan nilai b: ");
        
        int b=ib.nextInt();
        
        int c = a % b; double da = 13.75; double dc = da % b; 
        System.out.println("Sisa bagi " + a + "/" + b + " adalah " + c);
        System.out.println("Sisa bagi " + da + "/" + b + " adalah " + dc);
    }
    
}
