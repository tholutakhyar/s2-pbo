/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum2;

/**
 *
 * @author Tholut Akhyar
 */
public class restoran {
    //Variable (Private) 
    private String menu; 
    private double harga; 
    private boolean spesial; 

    //Method Setter (Public) dengan Parameter 
    public void setMenu(String menu){
        this.menu = menu; 
    } 
    public void setharga(double harga){ 
        this.harga = harga; 
    } 
    public void setSpesial(boolean spesial){ 
        this.spesial = spesial; 
    } 

    //Method Getter (Public) 
    public String getMenu(){ 
        return menu; 
    } 
    public double getHarga(){ 
        return harga; 
    } 
    public boolean getSpesial(){ 
        return spesial; 
    } 
}
