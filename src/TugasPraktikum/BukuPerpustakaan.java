package TugasPraktikum;

import java.util.Scanner;

public class BukuPerpustakaan {
    public static void main(String[] args) {
        informasinya buku1 = new informasinya("Disonansi", "Edith Ps", 2015, 248);
        informasinya buku2 = new informasinya("Sukses Jadi nomor 1","Eileen Rachman",2016, 163);
        informasinya buku3 = new informasinya("Konspirasi Alam Semesta","fiersa Bersari",2017,238);
        
        System.out.println("======----SELAMAT DATANG DI POJOK BACA XRPL2----======");
        System.out.println("--Disini terdapat berbagai macam buku,\n Silahkan pilih yang ingin anda ketahui informasinya--");
        System.out.println("1. Disonansi\n2. Sukses Jadi nomor 1\n3. Konspirasi Alam Semesta");
        Scanner frd = new Scanner(System.in);
        int jawab = frd.nextInt();
        switch (jawab) {
            case 1:
                System.out.println("Informasi Buku");
                buku1.info();
                break;
            case 2:
                System.out.println("Informasi Buku");
                buku2.info();
                break;
            case 3:
                System.out.println("Informasi Buku");
                buku3.info();
                break;
            default:
                System.out.println("Maaf  Pilihan Tidak Tersedia");
                break;
        }
        System.out.println("Apakah anda ingin mencari info lagi tentang buku buku yang ada di pojok baca XRPL2(YA/TIDAK)");
        String jwb = frd.nextLine();
        if (jwb.equalsIgnoreCase("TIDAK")) {
            boolean running = false;
            running = false;
            
            
        }
        }
    }

