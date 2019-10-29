/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author Asus
 */
public class buku {

    String Judul;
    int tahunterbit;
    String pengarang;

    public buku(String Judul, int tahunterbit, String pengarang) {
        this.Judul = Judul;
        this.tahunterbit = tahunterbit;
        this.pengarang = pengarang;

    }
    public void info() {
        System.out.println("Judul Buku: " + this.Judul);
        System.out.println("Pengarang: "+this.pengarang);
        System.out.println("Tahun Terbit: " + this.tahunterbit);
        

    }
}
