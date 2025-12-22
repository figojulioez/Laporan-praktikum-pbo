/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasiperpustakaan;

/**
 *
 * @author VOSTRO V131
 */
// Import library collection dan serilialisasi
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Class Peminjaman mengimplementasikan interface Transaksi
public class Peminjaman implements Transaksi, Serializable {

    // Mendefinisikan atribut anggota
    private Anggota anggota;
    // Mendefinisikan daftar buku yang dipinjam (komposisi)
    private List<Buku> daftarBuku = new ArrayList<>();

    // Constructor untuk menginisialisasi anggota
    public Peminjaman(Anggota anggota) {
        this.anggota = anggota;
    }

    // Method untuk menambahkan buku ke daftar peminjaman
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    // Implementasi method pinjam
    @Override
    public void pinjam() {
        System.out.println("Anggota " + anggota.getNama() + " meminjam buku:");
        for (Buku b : daftarBuku) {
            b.tampilInfo();
        }
    }

    // Implementasi method kembali
    @Override
    public void kembali() {
        System.out.println("Pengembalian buku oleh " + anggota.getNama());
        daftarBuku.clear();
    }
}
