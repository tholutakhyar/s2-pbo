/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12_segitiga;

/**
 *
 * @author Tholut Akhyar
 */
public class Hasil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        Prisma prisma = new Prisma();
        segitiga.alas = 8;
        segitiga.tinggi = 12;
        prisma.tinggiPrisma = 10;
        prisma.alas = segitiga.alas;
        prisma.tinggi = segitiga.tinggi;
        
        
        System.out.println("Segitiga");
        System.out.println("Alas Segitiga: " + segitiga.alas);
        System.out.println("Tinggi Segitiga: " + segitiga.tinggi);
        segitiga.luas();
        
        System.out.println("\n\nPrisma");
        System.out.println("Tinggi Prisma: " + prisma.tinggiPrisma);
        prisma.volume();
    }
    
}
