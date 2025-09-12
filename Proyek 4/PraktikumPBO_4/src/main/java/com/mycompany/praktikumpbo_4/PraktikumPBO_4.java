/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumpbo_4;

// Karena class Java berada di package yang berbeda maka dilakukannya sebuah import
import praktikum4.Mobil;
/**
 *
 * @author acer
 */
// Modifier yang digunakan pada class adalah public maka class tersebut bisa di instansi di objek mana saja
public class PraktikumPBO_4 {

//    public static void main(String[] args) {
//        // Karena modifer dari class Kendaaraan adalah public maka bisa diisntasi dimana saja
//        // Melakukan instansi dari class kendaraan menjadi objek mobil
//        // Terdapat sebuah constructor  yang dijalankan untuk mengisi data merek dengan Toyota model Avanza dan tahun 2020
//        Kendaraan mobil = new Kendaraan("Toyota", "Avanza", 2020);
//
//        // Menampilkan data awal
//        // Menampilkan data merek dengan getter
//        // Karena modifer dari getMerek adalah public maka dapat digunakan di luar class
//        System.out.println("Merek: " + mobil.getMerek());
//        // Menampilkan data model dengan getter
//        // Karena modifer dari getModel adalah public maka dapat digunakan di luar class
//        System.out.println("Model: " + mobil.getModel());
//        // Menampilkan data tahun dengan getter
//        // Karena modifer dari getTahun adalah public maka dapat digunakan di luar class
//        System.out.println("Tahun: " + mobil.getTahun());
//        
//        // Mengubah data
//        // Merubah data dari atribut model dengan setter
//        // Atribut model dirubah dari Avanza menjadi Innova
//        // Karena modifer dari setModel adalah public maka dapat digunakan di luar class
//        mobil.setModel("Innova");
//        // Merubah data dari atribut tahun dengan setter
//        // Atribut model dirubah dari 2020 menjadi 2021
//        // Karena modifer dari setTahun adalah public maka dapat digunakan di luar class
//        mobil.setTahun(2021);
//
//        // Menampilkan data setelah perubahan
//        System.out.println("Model baru: " + mobil.getModel());
//        System.out.println("Tahun baru: " + mobil.getTahun());
//    }
    
    public static void main(String[] args) {
     // Instansi class Mobil menjadi objek ferrari
     Mobil ferrari = new Mobil("Enzo Ferrari", 1200, "V8", 2);
     
     /* Setelah class dinstansi mari kita coba beberapa method atau properti yang ada pada class Kendaraan
         untuk membuktikan apakah inheritance berhasil */
     ferrari.tampilkanInfoKendaraan();
     ferrari.tampilkanInfoMobil();
    }
    
    
}
