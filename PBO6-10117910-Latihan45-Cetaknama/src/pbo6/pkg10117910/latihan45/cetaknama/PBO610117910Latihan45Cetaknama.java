/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program cetak nama
 *
 */
package pbo6.pkg10117910.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO610117910Latihan45Cetaknama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Printer ptr = new Printer();
        Scanner scn = new Scanner(System.in);
        
        System.out.println("=====Aplikasi pencetak nama=====");
        System.out.print("Masukan Nama Anda       : ");
        ptr.setNama(scn.next());
        System.out.print("Mau Cetak Berapa Kali?  : ");
        ptr.setJmlCetak(scn.nextInt());
        ptr.cetak(ptr.getNama());
        ptr.cetak(ptr.getJmlCetak(), ptr.getNama());
    }
    
}
