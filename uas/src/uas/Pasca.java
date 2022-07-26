/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

/**
 *
 * @author Tholut Akhyar
 */
public class Pasca extends Mahasiswa {
    protected String jurusan;
    
    protected String set_jurusan(String val) {
        this.jurusan = val;
        return this.jurusan;
    }
    
    protected String get_jurusan() {
        return this.jurusan;
    }
    
    @Override
    protected void tampil_semua() {
        System.out.println("\n\nclass pasca");
        System.out.println("alamat: " + this.get_alamat());
        System.out.println("hobi: " + this.get_hobi());
        System.out.println("jurusan: " + this.get_jurusan());
    }
}
