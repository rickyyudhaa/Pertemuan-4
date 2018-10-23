/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117910.latihan41.massajenis;

/**
 *
 * @author User
 */
public class Kubus {
    private int massa, sisi;

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    public int hitungVolume (int sisi){
        return sisi * sisi *sisi;
    }
    public int hitungMassaJenis(int parMasa, int volume){
        return massa / volume;
    }
}
