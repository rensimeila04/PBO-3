package Latihan2;

public class Person {

    private String nama;
    private int usia;

    //konstruktor
    public Person(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;

    }

    //metode
    public void info() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Usia: " + this.usia);

    }
}
