/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program hukum ohm
 *
 */
package pbo6.pkg10117910.latihan44.hukumohm;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class PBO610117910Latihan44Hukumohm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        baterai btr = new baterai();
        
        System.out.println("Kuat Arus     : "+btr.getKuatArus());
        System.out.println("Hambatan      : "+btr.getHambatan());
        System.out.println("Hasil Tegangan      : "+btr.hitungTegangan()+" VOLT");
        
    }
    
}
