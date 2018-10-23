/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Gaji pegawai
 *
 */
package pbo6.pkg10117910.lathan43.gajipegawai;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO610117910Lathan43GajiPegawai {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gajipegawai gjp = new Gajipegawai();
        Scanner scn = new Scanner(System.in);
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("--------------------");
        System.out.print("Nama Karyawan       : ");
        gjp.setNama(scn.next());
        System.out.print("Alamat              : ");
        gjp.setAlamat(scn.next());
        System.out.print("Uang Transport      : ");
        gjp.setUangTransport(scn.nextInt());
        System.out.print("Uang Tunjangan      : ");
        gjp.setUangTunjangan(scn.nextInt());
        System.out.print("Gaji Pokok          : ");
        gjp.setGajiPokok(scn.nextInt());
        gjp.tampilData(gjp.getNama(), gjp.getAlamat(), gjp.getUangTunjangan(), 
                gjp.getUangTransport(), gjp.getGajiPokok(), gjp.getTotalGaji());
        
    }
    
}
