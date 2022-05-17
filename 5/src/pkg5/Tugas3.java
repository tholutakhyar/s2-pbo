/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5;

import java.util.Scanner;

/**
 *
 * @author Tholut Akhyar
 */
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("nilai tes: ");
        int nilai_tes = input.nextInt();
        
        System.out.println("lama kerja: ");
        int lama_kerja = input.nextInt();
        
        System.out.println("usia: ");
        int usia = input.nextInt();
        
        if ((nilai_tes > 80 || lama_kerja > 5) && usia < 35) {
            System.out.println("memenuhi syarat untuk menjadi pegawai tetap!");
        } else {
            System.out.println("tidak memenuhi syarat untuk menjadi pegawai tetap!");
        }
    }
    
}
