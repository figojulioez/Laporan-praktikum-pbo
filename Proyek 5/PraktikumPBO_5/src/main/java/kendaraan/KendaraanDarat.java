/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author VOSTRO V131
 */
// Class menengah yang akan mewarisi semua karakteristik kendaraan
public class KendaraanDarat extends Kendaraan {
    // Membuat atribut jumlahRoda
    protected int jumlahRoda;

    // Method constructor function untuk mengisi nilai atribut kendaraan dan atribut classnya sendiri
    public KendaraanDarat(String nama, int kecepatan, int jumlahRoda) {
        // memanggil constructor class Kendaraan 
        super(nama, kecepatan);
        // Menyimpan nilai properti dari jumlah roda
        this.jumlahRoda = jumlahRoda;
    }
    
    // Melakukan sebuah override pada method kendaraan pada class kendaraan
    @Override
    public void tampilkanInfo() {
        // Menampilkan method yang lama
        super.tampilkanInfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}
