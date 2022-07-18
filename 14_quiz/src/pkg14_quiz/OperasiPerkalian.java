/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg14_quiz;

/**
 *
 * @author Tholut Akhyar
 */
public class OperasiPerkalian extends OperasiBilangan {
    @Override
    protected void set_C() {
        this.c = this.a * this.b;
    }
    
    @Override
    protected void tampil() {
        System.out.println("Hasil Operasi dari " + this.a + " x " + this.b + " = " + this.c);
    }
}
