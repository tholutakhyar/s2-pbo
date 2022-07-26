/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uas;

/**
 *
 * @author Tholut Akhyar
 */

public class Uas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instalasi maba, pasca, karyawan, science, social
        Maba maba_class = new Maba();
        Pasca pasca_class = new Pasca();
        Karyawan karyawan_class = new Karyawan();
        Science science_class = new Science();
        Social social_class = new Social();
        
        //pemanggilan fungsi
        maba_class.set_hobi("mengetik kode");
        maba_class.set_alamat("malang, tlogomas");
        maba_class.tampil_semua();
        
        
        pasca_class.set_jurusan("teknik informatika");
        pasca_class.set_hobi("bermain valorant");
        pasca_class.set_alamat("bali");
        pasca_class.tampil_semua();
        
        
        karyawan_class.set_alamat("kalimantan");
        karyawan_class.set_hobi("memancing");
        karyawan_class.set_work("admin");
        karyawan_class.tampil_semua();
        
        
        science_class.set_namajurusan("marketing");
        science_class.set_hobi("seminar");
        science_class.set_alamat("bogor");
        science_class.tampil_semua();
        
        
        social_class.set_hobi("memasak");
        social_class.set_alamat("padang");
        social_class.tampil_semua();
    }
    
}
