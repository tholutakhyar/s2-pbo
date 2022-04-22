package pkg4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tx
 */
public class Praktikum9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String bulan = null;
        String triwulan = null;
        int noBulan = 3;
        switch(noBulan) {
            case 1: bulan = "Januari"; break;
            case 2: bulan = "Februari"; break;
            case 3: bulan = "Maret"; break;
            case 4: bulan = "April"; break;
            case 5: bulan = "Mei"; break;
            case 6: bulan = "Juni"; break;
            case 7: bulan = "Juli"; break;
            case 8: bulan = "Agustus"; break;
            case 9: bulan = "September"; break;
            case 10: bulan = "Oktober"; break;
            case 11: bulan = "November"; break;
            case 12: bulan = "Desember"; break;
            default: {
                System.out.println("Tidak ada bulan ke-" + noBulan);
                System.exit(1);
            }
        }
        switch (noBulan) {
            case 1:
            case 2:
            case 3:
            case 4: {
                triwulan = "I";
                break;
            }
            case 5:
            case 6:
            case 7:
            case 8: {
                triwulan = "II";
                break;
            }
            case 9:
            case 10:
            case 11:
            case 12: {
                triwulan = "III";
                break;
            }
            default: {
                System.out.println("Tidak ada bulan ke-" + noBulan);
                System.exit(1);
            }
        }
        System.out.println("Bulan ke-" + noBulan + " (" + bulan + ") masuk ke dalam triwulan " + triwulan);
    }
    
}
