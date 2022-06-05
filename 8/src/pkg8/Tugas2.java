/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8;

import java.util.Scanner;

/**
 *
 * @author Tholut Akhyar
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] mat_a = new int[2][2];
        int [][] mat_b = new int[2][2];
        int [][] mat_c = new int[2][2];
        
        // proses input
        System.out.println("input mat a");
        for (int i = 0; i < 2; i++ ) {
            for (int i2 = 0; i2 < 2; i2++) {
                System.out.print("masukan nilai baris " + (i + 1) + ", kolom " + (i2 + 1) + ": ");
                int get_nilai = input.nextInt();
                mat_a[i][i2] = get_nilai;
            }
        }
        
        System.out.println("\ninput mat b");
        for (int i = 0; i < 2; i++ ) {
            for (int i2 = 0; i2 < 2; i2++) {
                System.out.print("masukan nilai baris " + (i + 1) + ", kolom " + (i2 + 1) + ": ");
                int get_nilai = input.nextInt();
                mat_b[i][i2] = get_nilai;
            }
        }
        
        //proses menghitung mat a dan b
        for (int i = 0; i < 2; i++ ) {
            for (int i2 = 0; i2 < 2; i2++) {
                mat_c[i][i2] = mat_a[i][i2] + mat_b[i][i2];
            }
        }
        
        //proses menampilkan
        System.out.println("mat a:");
        for (int i = 0; i < 2; i++ ) {
            for (int i2 = 0; i2 < 2; i2++) {
                System.out.print(mat_a[i][i2] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\n+");
        
        System.out.println("\nmat b:");
        for (int i = 0; i < 2; i++ ) {
            for (int i2 = 0; i2 < 2; i2++) {
                System.out.print(mat_b[i][i2] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\n=");
        
        System.out.println("\nmat c:");
        for (int i = 0; i < 2; i++ ) {
            for (int i2 = 0; i2 < 2; i2++) {
                System.out.print(mat_c[i][i2] + " ");
            }
            System.out.println();
        }
    }
    
}
