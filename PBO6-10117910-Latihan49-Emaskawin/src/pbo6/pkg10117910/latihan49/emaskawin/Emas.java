/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117910.latihan49.emaskawin;

/**
 *
 * @author User
 */
public class Emas {
    private double berat;
    private double totalHarga;

    public void setBerat(double berat) {
        this.berat = berat;
    }
    
    public void kalkulasi(){
        totalHarga = berat * 570000;
        System.out.println("Harga emas bulan Oktober (1 gram)   : Rp570.000");
        System.out.println("Total Emas yang dibeli              : "+berat+" gram");
        System.out.println("Total Harga yang harus dibayar      : RP"+totalHarga);
        
    }
}
