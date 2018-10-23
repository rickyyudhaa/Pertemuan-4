/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117910.latihan44.hukumohm;

/**
 *
 * @author User
 */
public class baterai {

    private float kuatArus, hambatan;

    public baterai() {
        System.out.println("===== Hukum Ohm =====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar "
                +"\n akan berbanding lurus dengan beda potensial"
                +"\npada ujung-ujung kawat penghantar tersebut"
                +"\nasalkan suhu kawat dijaga konstan.");
    }

    public baterai(float kuatArus, float Hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        kuatArus  = 3;
        return kuatArus;
    }

    public float getHambatan() {
        hambatan = 12;
        return hambatan;
    }

    public float hitungTegangan() {

        return kuatArus * hambatan;
    }

}
