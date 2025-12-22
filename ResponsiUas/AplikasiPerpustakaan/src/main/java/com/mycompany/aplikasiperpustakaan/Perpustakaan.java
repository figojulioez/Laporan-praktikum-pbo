/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasiperpustakaan;

/**
 *
 * @author VOSTRO V131
 */
// Import library collection dan serialisasi
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Class Perpustakaan
public class Perpustakaan implements Serializable {

    // Mendefinisikan daftar anggota (agregasi)
    private List<Anggota> daftarAnggota = new ArrayList<>();

    // Method untuk menambahkan anggota ke perpustakaan
    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
    }

    // Method untuk menampilkan seluruh anggota
    public void tampilAnggota() {
        for (Anggota a : daftarAnggota) {
            System.out.println("Nama Anggota: " + a.getNama());
        }
    }

    // Method getter daftar anggota
    public List<Anggota> getDaftarAnggota() {
        return daftarAnggota;
    }
}


