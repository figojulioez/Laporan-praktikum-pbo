/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aplikasiperpustakaan;

/**
 *
 * @author VOSTRO V131
 */
// Class Buku
public class Buku extends Koleksi {
    // Mendefinisikan pengarang
    private String pengarang;

    // method constructor untuk menginisiasi atribut id, judul, pengarang
    public Buku(String id, String judul, String pengarang) {
        super(id, judul);
        this.pengarang = pengarang;
    }
    
    // Overriding method dari class Koleksi
    @Override
    public void tampilInfo() {
        System.out.println("ID Buku   : " + id);
        System.out.println("Judul     : " + judul);
        System.out.println("Pengarang : " + pengarang);
    }
}

