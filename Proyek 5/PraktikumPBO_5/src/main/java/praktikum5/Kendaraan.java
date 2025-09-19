/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author VOSTRO V131
 */
// Class Kendaraan yang akan menjadi parent dari class lain
public class Kendaraan {
    // Atribut dengan akses modifier berbeda
    private String nama;             // Hanya bisa diakses dalam kelas ini
    protected int kecepatanMaks;     // Bisa diakses di package yang sama dan subclass
    public String jenisMesin;        // Bisa diakses dari mana saja

    // Constructor dimana pada constructor ini akan mengisi setiap properti properti
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }

    // Getter dan Setter untuk variabel private nama
    /* Ini merupakan proses Enkapsulasi dimana untuk mengases atribut nama harus menggunakan method getNama terlebih dahulu
//       tujuannya adalah untuk melindungi atribut nama */
    public String getNama() {
        return nama;
    }
    
    
//    // Sebuah setter jiakalu ingin merubah nilai atau isi dari atribut nama untuk menjaga sebuah perubahan yang tidak sah
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method public untuk menampilkan informasi kendaraan
    // method dibuat void karena hanya menampilkan dan tidak mengembalikan nilai sama sekali
    public void tampilkanInfoKendaraan() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
    
    // Menampilkan method tampilkanInfo untuk mengembalikan informasi dari mobil dalam bentuk string
    public String tampilkanInfo() {
        return "Nama dari kendaraan" + this.nama + "\nKecepatan Maksimum " + this.kecepatanMaks + "\nJenis mesin " + this.jenisMesin;
    }
}
