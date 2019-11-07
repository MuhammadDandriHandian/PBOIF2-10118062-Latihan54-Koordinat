/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan54.koordinat;

/**
 *
 * @author ASUS
 */
public class PBOIF210118062Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        warnakordinat hasil = new warnakordinat("nama", 10, 4);
        hasil.setNamawarna("jingga");
        System.out.println("Warna Koordinat : "+hasil.getNamawarna());
        hasil.setX(10);
        hasil.setY(4);
        System.out.println("Koordinat Sumbu x : "+hasil.getX()+","+"y :"+hasil.getY());
    }
    
}
