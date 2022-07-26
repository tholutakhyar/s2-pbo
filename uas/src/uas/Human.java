/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas;

/**
 *
 * @author Tholut Akhyar
 */
public abstract class Human {
    protected String work;
    protected String hobi;
    protected String alamat;
    
    protected String set_work(String val) {
        this.work = val;
        return this.work;
    }
    
    protected String set_hobi(String val) {
        this.hobi = val;
        return this.hobi;
    }
    
    protected String set_alamat(String val) {
        this.alamat = val;
        return this.alamat;
    }
    
    protected String get_work() {
        return this.work;
    }
    
    protected String get_hobi() {
        return this.hobi;
    }
    
    protected String get_alamat() {
        return this.alamat;
    }
    
    protected void tampil_semua() {}
}
