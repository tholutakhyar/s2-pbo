/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum1;

/**
 *
 * @author Tholut Akhyar
 */
public class NilaiTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nilai Biodata = new Nilai(); 
        Biodata.Nama = "Adelya"; 
        Biodata.NIM = "5302414023"; 
        Biodata.setNilai(90); 
        System.out.println("Nama = "+ Biodata.Nama); 
        System.out.println("NIM = "+ Biodata.NIM); 
        System.out.println("Nilai = "+ Biodata.getNilai());

    }
    
}
