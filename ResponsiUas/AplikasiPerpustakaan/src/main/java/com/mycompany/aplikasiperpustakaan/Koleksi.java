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

public abstract class Koleksi implements Serializable {
    // atribut id dan judul
    protected String id;
    protected String judul;

    // method constructor untuk menginisiasi atribut id dan judul saat di instansi
    public Koleksi(String id, String judul) {
        this.id = id;
        this.judul = judul;
    }
    
    // method abstract dari kelas Koleksi, yang nantinya akan berbeda - beda implementasinya pada kelas turunannya
    public abstract void tampilInfo();

    // method getter id
    public String getId() {
        return id;
    }
    
    // method getter judul
    public String getJudul() {
        return judul;
    }
}
