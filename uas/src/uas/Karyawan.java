/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

/**
 *
 * @author Tholut Akhyar
 */
public class Karyawan extends Human {
    @Override
    protected void tampil_semua() {
        System.out.println("\n\nclass karyawan");
        System.out.println("alamat: " + this.get_alamat());
        System.out.println("hobi: " + this.get_hobi());
        System.out.println("work: " + this.get_work());
    }
}
