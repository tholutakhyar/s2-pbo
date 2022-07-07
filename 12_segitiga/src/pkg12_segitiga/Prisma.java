/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg12_segitiga;

/**
 *
 * @author Tholut Akhyar
 */
public class Prisma extends Segitiga{
    float tinggiPrisma;
    
    float volume() {
        float volume =  ( (alas * tinggi)/2 ) * tinggiPrisma;
        System.out.println("Volume Prisma: " + volume);
        return volume;
    }
}
