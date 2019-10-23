/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan44.hukumohm;

/**
 *
 * @author
 * NAMA     : Bagus Syibro Malisi
 * KELAS    : IF-2
 * NIM      : 10118052
 * Deskripsi Program : Membuat program berbasis object untuk menghitung tegangan
 * dengan hukum ohm
 */
public class Baterai {
    private float kuatArus, hambatan;
    
    public Baterai() {
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar\n"
                +"akan berbanding lurus dengan beda potensial\n"
                +"pada ujung-ujung kawat penghantar tersebut\n"
                +"asalkan suhu kawat dijaga konstan.\n");
    }
    
    public Baterai(float kuatArus, float hambatan) {
        this.hambatan = hambatan;
        this.kuatArus = kuatArus;
        
        System.out.println("Kuat Arus : " + getKuatArus() + " ampere ");
        System.out.println("Hambatan : " + getHambatan() + " ohm ");
        System.out.println("Hasil Tegangan : " + hitungTegangan() + " volt ");
        
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan() {
        return hambatan * kuatArus;
    }
}
