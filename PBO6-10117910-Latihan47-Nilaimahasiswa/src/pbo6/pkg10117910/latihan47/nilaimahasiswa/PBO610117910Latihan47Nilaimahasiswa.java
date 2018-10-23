/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Nilai mahasiswa
 *
 */

package pbo6.pkg10117910.latihan47.nilaimahasiswa;

/**
 *
 * @author User
 */
public class PBO610117910Latihan47Nilaimahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nilai n = new Nilai();
        n.setNilaiQuiz(60);
        n.setNilaiUTS(80);
        n.setNilaiUAS(75);
        n.kalkulasiNilai();
    }
    
}
