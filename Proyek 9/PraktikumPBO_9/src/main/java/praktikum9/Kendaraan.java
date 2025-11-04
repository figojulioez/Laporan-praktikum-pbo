/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author VOSTRO V131
 */
// Mendfinisikan abstrak class yang membuat class tidak bisa di inisiasi
abstract public class Kendaraan {
    // Metode abstract yang akan dirubah pada setiap sub - sub class
    abstract void berjalan();
    
    // Metode dengan implementasi
    void info() {
        System.out.println("Ini adalah kendaraan");
    }
}

// Kelas turunan dari Kendaraan bernama mobil
class Mobil extends Kendaraan {
    // Melakukan sebuah polymorfisme Dinamis yaitu Override dengan merubah bentuk class parent
    @Override
    void berjalan() {
        System.out.println("Mobil sedang berjalan dengan cepat.");
    }
}

// Kelas turunan dari Kendaraan bernama sepeda
class Sepeda extends Kendaraan {
    // Melakukan sebuah polymorfisme Dinamis yaitu Override dengan merubah bentuk class parent
    @Override
    void berjalan() {
        System.out.println("Sepeda sedang berjalan dengan pelan.");
    }
}