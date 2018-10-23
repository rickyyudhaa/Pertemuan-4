/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Tabungan
 *
 */
package pbo6.pkg10117910.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO610117910Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukan Saldo Awal            : ");
        Tabungan tab = new Tabungan(scn.nextInt());
        System.out.print("Jumlah Uang Yang Diambil      : ");
        int jumlah = scn.nextInt();
        System.out.print("Saldo Anda Sekarang           : "+tab.ambilUang(jumlah));
    }

}
