/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

import java.util.Scanner;

/**
 *
 * @author tx
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner i_nim = new Scanner(System.in);
        System.out.println("Masukan NIM:");
        int nim = i_nim.nextInt();
        
        Scanner i_nama = new Scanner(System.in);
        System.out.println("Masukan Nama:");
        String nama = i_nama.nextLine();
        
        Scanner i_alamat = new Scanner(System.in);
        System.out.println("Masukan Alamat:");
        String alamat = i_alamat.nextLine();
        
        Scanner i_prodi = new Scanner(System.in);
        System.out.println("Masukan Prodi:");
        String prodi = i_prodi.nextLine();
        
        Scanner i_usia = new Scanner(System.in);
        System.out.println("Masukan Usia:");
        int usia = i_usia.nextInt();
        
        System.out.println("\n\nMenampilkan Data Input");
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Prodi : " + prodi);
        System.out.println("Usia : " + usia);
    }
    
}
