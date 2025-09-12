/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author acer
 */

//
//// Membuat sebuah class Kendaraan untuk mempraktikan Enkapsulasi
//// Modifier yang digunakan pada class adalah public maka class tersebut bisa di instansi di objek mana saja
//public class Kendaraan {
//    // Membuat sebuah atribut bernama merek untuk menyimpan data tentang merek kendaraan
//    // Tipe data yang digunakan adalah string maka akan menyimpan data string
//    // Modifier yang digunakan adalah private maka atribut hanya bisa digunakan di class nya sendiri
//    private String merek;
//    // Membuat sebuah atribut bernama model untuk menyimpan data tentang model kendaraan
//    // Tipe data yang digunakan adalah string maka akan menyimpan data string
//    // Modifier yang digunakan adalah private maka atribut hanya bisa digunakan di class nya sendiri
//    private String model;
//    // Membuat sebuah atribut bernama tahun untuk menyimpan data tentang tahun kendaraan
//    // Tipe data yang digunakan adalah integer maka akan menyimpan data bilangan bulat
//    // Modifier yang digunakan adalah private maka atribut hanya bisa digunakan di class nya sendiri
//    private int tahun;
//
//    // Constructor atau sebuah method yang pertama kali  dijalan saat class di instansi
//    // Tujuan dari constructor kendaraan adalah untuk membangun class tersebut dengan mengisi beberapa atribut utama
//    public Kendaraan(String merek, String model, int tahun) {
//        this.merek = merek;
//        this.model = model;
//        this.tahun = tahun;
//    }
//
//    // Getter dan Setter untuk merek
//    /* Ini merupakan proses Enkapsulasi dimana untuk mengases atribut merek harus menggunakan method getMerek terlebih dahulu
//       tujuannya adalah untuk melindungi atribut merek */
//    public String getMerek() {
//        // Nilai yang dikembalikan dari method getMerek adalah data yang disimpan dari atribut merek
//        return merek;
//    }
//    // Sebuah setter jiakalu ingin merubah nilai atau isi dari atribut merek untuk menjaga sebuah perubahan yang tidak sah
//    public void setMerek(String merek) {
//        this.merek = merek;
//    }
//
//    // Getter dan Setter untuk model
//    /* Ini merupakan proses Enkapsulasi dimana untuk mengases atribut model harus menggunakan method getModel terlebih dahulu
//       tujuannya adalah untuk melindungi atribut model */
//    public String getModel() {
//         // Nilai yang dikembalikan dari method getModel adalah data yang disimpan dari atribut model
//        return model;
//    }
//
//    // Sebuah setter jiakalu ingin merubah nilai atau isi dari atribut model untuk menjaga sebuah perubahan yang tidak sah
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    // Getter dan Setter untuk tahun
//    /* Ini merupakan proses Enkapsulasi dimana untuk mengases atribut tahun harus menggunakan method getTahun terlebih dahulu
//       tujuannya adalah untuk melindungi atribut tahun */
//    public int getTahun() {
//         // Nilai yang dikembalikan dari method getTahun adalah data yang disimpan dari atribut tahun
//        return tahun;
//    }
//    // Sebuah setter jiakalu ingin merubah nilai atau isi dari atribut tahun untuk menjaga sebuah perubahan yang tidak sah
//    public void setTahun(int tahun) {
//        this.tahun = tahun;
//    }
//}

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
}