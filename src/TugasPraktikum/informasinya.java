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
public class informasinya extends buku {

    int jumlahhalaman;

    public informasinya(String Judul,String pengarang, int tahunterbit,  int jumlahhalaman) {
        super(Judul, tahunterbit, pengarang);
        this.jumlahhalaman = jumlahhalaman;
    }

    public void info() {
        System.out.println("Jumlah halaman :" + this.jumlahhalaman);
        super.info();
    }
}
