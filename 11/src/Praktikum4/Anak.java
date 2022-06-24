/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum4;

/**
 *
 * @author Tholut Akhyar
 */
public class Anak extends Bapak{ 
    public String getNamaPublic(){ 
        return super.getNama(); 
    } 
    
//    public String getNamaPrivate(){ 
//        return super.getNamaPrivate(); 
//        // INI AKAN ERROR karena hak akses di parent class untuk method ini private //
//    } 
    
    @Override 
    public String getAlamat(){ 
        return super.getAlamat(); 
    } 

    public static void main(String args[]) { 
        Anak g = new Anak(); 
        System.out.println("dari method public : " + g.getNamaPublic());
        System.out.println("dari method protected : " + g.getAlamat());
    } 
} 

