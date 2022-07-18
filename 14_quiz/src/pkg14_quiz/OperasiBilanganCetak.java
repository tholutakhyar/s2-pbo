/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14_quiz;

/**
 *
 * @author Tholut Akhyar
 */
public class OperasiBilanganCetak extends OperasiBilangan {
    private void cetakSemua(OperasiBilangan[] OB, double a, double b) {
        for (int i = 0; i < OB.length; i++) {
            OB[i].set_A(a);
            OB[i].set_B(b);
            OB[i].set_C(); // proses menghitung
            //System.out.println(OB[i].get_A() + " | " + OB[i].get_B() + " | " + OB[i].get_C());
            OB[i].tampil();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // karena memanggil fungsi non-statik maka dibuatkan Object OperasiBilanganCetak agar dapet mengakses ke cetakSemua, melalui fungsi start yang non-static juga.
        OperasiBilanganCetak app = new OperasiBilanganCetak();
        app.start();
    }
    
    public void start() {
        OperasiBilangan[] daftarOperasi = new OperasiBilangan[4];
        daftarOperasi[0] = new OperasiPenjumlahan();
        daftarOperasi[1] = new OperasiPengurangan();
        daftarOperasi[2] = new OperasiPerkalian();
        daftarOperasi[3] = new OperasiPembagian();
        cetakSemua(daftarOperasi, 12, 2);
    }
    
}
