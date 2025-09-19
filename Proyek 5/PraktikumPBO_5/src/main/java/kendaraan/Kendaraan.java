/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author VOSTRO V131
 */
public class Kendaraan {
    // Modifier atribut diberi protected agar hanya bisa digunakan di package yang sama atau sub class
    // Membuat atribut nama
    protected String nama;
    // Membuat atribut kecepatan
    protected int kecepatan;

    // Method Constructor untuk mengisi nilai - nilai dari atribut utama.
    public Kendaraan(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    // Method yang nantinya akan digunakan untuk menguji hirarki yang akan di override
    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }   
}
