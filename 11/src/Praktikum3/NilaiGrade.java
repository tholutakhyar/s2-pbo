/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;

/**
 *
 * @author Tholut Akhyar
 */
public class NilaiGrade {
    private int nilai = 0; 
    
    private String hitungGrade(){ 
        if(nilai >= 80){ 
            return "A"; 
        } else if(nilai < 80 && nilai >= 70){ 
            return "B"; 
        }
        
        return "C"; 
    }
    
    public String getGrade(int nilai){ 
        this.nilai = nilai; 
        return hitungGrade(); 
    }

}
