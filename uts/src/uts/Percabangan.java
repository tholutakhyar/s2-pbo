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
public class Percabangan {

    /**
     * @param args the command line arguments
     */ 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice_operasi = 0, choice_penyakit = 0;
        String name_operasi = null, name_penyakit = null, price_operasi = null;
        boolean on_choice = false;
        
        // note
        // 1 = mata, 2 = jantung
        // mata, 1 = katarak, 2 = plus / minus, 3 = silinder
        // jantung, 1 = jantung koroner, 2 = katup hantung, 3 = otot jatung
        
        System.out.println("aplikasi mengedintifikasi biaya operasi suatu penyakit");
        on_choice = true;
        
        while (on_choice) {
            
            System.out.println("jenis operasi:"
                    + "\n1. mata"
                    + "\n2. jantung"
                    + "\npilih jenis operasi sesuai nomer (angka): ");

            choice_operasi = input.nextInt();

            if (choice_operasi == 1) {
                name_operasi = "mata";
            } else if (choice_operasi == 2) {
                name_operasi = "jantung";
            }

            if (name_operasi != null) {
                on_choice = false;
            } else {
                System.out.println("\n\n[ maaf jenis operasi tidak ada, silahkan pilih lagi! ]");
            }
        
        }
        
        System.out.println("\n\n");
        
        on_choice = true;
        
        while (on_choice) {
            System.out.println("jenis operasi:");
            if (choice_operasi == 1) {
                System.out.println("1. katarak"
                    + "\n2. plus / minus"
                    + "\n3. silinder");
            } else if (choice_operasi == 2) {
                System.out.println("1. jantung koroner"
                    + "\n2. katup jantung"
                    + "\n3. otot jantung");
            }
            
            System.out.println("pilih jenis operasi sesuai nomer (angka): ");
            
            choice_penyakit = input.nextInt();

            if (choice_operasi == 1) {
                if (choice_penyakit == 1) {
                    name_penyakit = "katarak";
                    price_operasi = "7.500.000";
                } else if (choice_penyakit == 2) {
                    name_penyakit = "plus / minus";
                    price_operasi = "5.000.000";
                } else if (choice_penyakit == 3) {
                    name_penyakit = "silinder";
                    price_operasi = "4.000.000";
                }
            } else if (choice_operasi == 2) {
                if (choice_penyakit == 1) {
                    name_penyakit = "jantung koroner";
                    price_operasi = "500.000.000";
                } else if (choice_penyakit == 2) {
                    name_penyakit = "katup jantung";
                    price_operasi = "350.000.000";
                } else if (choice_penyakit == 3) {
                    name_penyakit = "otot jantung";
                    price_operasi = "450.000.000";
                }
            }
            
            if (choice_operasi >= 1 && choice_operasi <= 2 && choice_penyakit >= 1 && choice_penyakit <= 3 && price_operasi != null) {
                on_choice = false;
                System.out.println("\n\n[ biaya operasi berhasil diindentifikasi! ]");
                System.out.println("jenis operasi: " + name_operasi);
                System.out.println("jenis penyakit: " + name_penyakit);
                System.out.println("biaya: Rp " + price_operasi);
            } else {
                System.out.println("\n\n[ maaf jenis penyakit tidak ada, silahkan pilih lagi! ]");
            }
        }
        
    }
    
}
