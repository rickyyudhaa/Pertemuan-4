/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Perkenalan Mahasiswa
 *
 */
package pbo6.pkg10117910.latihan41.massajenis;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO610117910Latihan41Massajenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kubus q = new Kubus();
        Scanner scn = new Scanner(System.in);
        
        System.out.println("=====Massa Jenis=====");
        System.out.print("Sisi : ");
        int sisi = scn.nextInt();
        System.out.print("Massa : ");
        int massa = scn.nextInt();
        q.setSisi(sisi);
        q.setMassa(massa);
        int volume = q.hitungVolume(sisi);
        
        System.out.println();
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("Volume : " + volume);
        System.out.println("Massa Jenis : " + q.hitungMassaJenis(massa,volume));
    }

}
