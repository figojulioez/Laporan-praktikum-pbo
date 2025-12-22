/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasiperpustakaan;

/**
 *
 * @author VOSTRO V131
 */
// Import Serializable untuk mengimplementasikan sebuah serilialisasi
import java.io.Serializable;

// Class anggota
public class Anggota implements Serializable {
    // Mendefinisikan atribut idAnggota
    private String idAnggota;
    // Mendefinisikan atribut nama
    private String nama;

    // Constructor method untuk menginisiasi atribut id, dan nama saat diisntansi
    public Anggota(String idAnggota, String nama) {
        this.idAnggota = idAnggota;
        this.nama = nama;
    }

    // method getter nama
    public String getNama() {
        return nama;
    }
}

