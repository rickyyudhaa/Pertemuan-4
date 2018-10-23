/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117910.latihan47.nilaimahasiswa;

/**
 *
 * @author User
 */
public class Nilai {
    private double nilaiAkhir;
    private double nilaiQuiz;
    private double nilaiUAS;
    private double nilaiUTS;
    private char index;
    private String keterangan;

    public void setNilaiQuiz(double nilaiQuiz) {
        this.nilaiQuiz = nilaiQuiz;
    }

    public void setNilaiUAS(double nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
    }

    public void setNilaiUTS(double nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
    }

    
    
    
    public void kalkulasiNilai(){
        nilaiAkhir = (0.20 * nilaiQuiz)+(0.3*nilaiUTS)+(0.5*nilaiUAS);
        if (nilaiAkhir <=100 && nilaiAkhir>=80) {
            index = 'A';
            keterangan = "Sangat Baik";
        }else
        if (nilaiAkhir>=68) {
            index = 'B';
            keterangan = "Baik";
        }else
        if (nilaiAkhir>=56) {
            index = 'C';
            keterangan = "Cukup";
        }else
        if (nilaiAkhir>=45.0) {
            index = 'D';
            keterangan = "Kurang";
        }else
        if (nilaiAkhir <=45 && nilaiAkhir>=0) {
            index = 'E';
            keterangan = "Sangat Kurang";
        }else{
            index = 'T';
            keterangan = "Input Nilai Salah";
        }
        
     
        
        System.out.println("QUIZ        : "+nilaiQuiz);
        System.out.println("UTS         : "+nilaiUTS);
        System.out.println("UAS         : "+nilaiUAS);
        System.out.println("Nilai akhir : "+nilaiAkhir);
        System.out.println("Index       : "+index);
        System.out.println("Keterangan  : "+keterangan);
    }
}
