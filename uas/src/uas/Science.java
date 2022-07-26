/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

/**
 *
 * @author Tholut Akhyar
 */
public class Science extends Dosen {
    protected String namajurusan;
    
    protected String set_namajurusan(String val) {
        this.namajurusan = val;
        return this.namajurusan;
    }
    
    protected String get_namajurusan() {
        return this.namajurusan;
    }
    
    @Override
    protected void tampil_semua() {
        System.out.println("\n\nclass science");
        System.out.println("alamat: " + this.get_alamat());
        System.out.println("hobi: " + this.get_hobi());
        System.out.println("nama jurusan: " + this.get_namajurusan());
    }
}
