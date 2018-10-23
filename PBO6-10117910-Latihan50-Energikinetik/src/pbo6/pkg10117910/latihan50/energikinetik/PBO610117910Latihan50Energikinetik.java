/*
 *
 * @author
 * NAMA 	: Ricky Yudha Pratama Kawamura
 * KELAS	: PBO6
 * NIM		: 10117910
 * 
 * Description : Program Energi Kinetik
 *
 */
package pbo6.pkg10117910.latihan50.energikinetik;

/**
 *
 * @author User
 */
public class PBO610117910Latihan50Energikinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola b = new Bola();
        b.setMass(145);
        b.setSpeed(25);
        System.out.println("Massa               : "+b.getMass());
        System.out.println("Kecepatan           : "+b.getSpeed());
        System.out.println("Energi Kinetic      : "+b.kineticE());
        System.out.println("Force               : "+b.force());
    }
    
}
