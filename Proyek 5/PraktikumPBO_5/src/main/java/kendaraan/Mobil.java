/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

/**
 *
 * @author VOSTRO V131
 */
public class Mobil extends KendaraanDarat{
    // Atribut ini merupakan atribut milik class Mobil meskipun keduanya anak dari kendaraan darat karena tidak akan saling mempengaruhi
    
    // Atribut jumlahPintu
    protected int jumlahPintu;

    // Constructor function untuk mengisi atribut pada class KendaraanDarat dan juga atribut pada class Mobil
    public Mobil(String nama, int kecepatan, int jumlahRoda, int jumlahPintu) {
        // Menginisasi atribut class parentnya
        super(nama, kecepatan, jumlahRoda);
        this.jumlahPintu = jumlahPintu;
    }

    // Melakukan sebuah overrding
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
