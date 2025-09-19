/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author VOSTRO V131
 */
// Class SepedaMotor mewarisi Class KendaraanDarat
public class SepedaMotor extends KendaraanDarat {
    // Modifier atribut diberi protected agar hanya bisa digunakan di package yang sama atau sub class
    // Membuat atribut jenisMesin pada sepeda motor
    protected String jenisMesin;

    // Constructor function yang berfungsi untuk menginisiasi atribut class SepdaMotor
    public SepedaMotor(String nama, int kecepatan, int jumlahRoda, String jenisMesin) {
        // Melakukan inisiasi pada class KendaraanDarat sebagai parent dari SepedaMotor
        super(nama, kecepatan, jumlahRoda);
        this.jenisMesin = jenisMesin;
    }

    // Melakukan Override
    @Override
    public void tampilkanInfo() {
        // Menampilkan override yang lama
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}

