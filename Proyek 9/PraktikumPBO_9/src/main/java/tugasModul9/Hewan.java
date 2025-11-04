/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasModul9;

/**
 *
 * @author VOSTRO V131
 */
// Mendfinisikan abstrak class yang membuat class tidak bisa di inisiasi
abstract public class Hewan {
    // Metode abstract yang akan dirubah pada setiap sub - sub class
    abstract void suara();
    
    // Metode implementasi
    void info() {
        System.out.println("Ini adalah Hewan");
    }
}

// Kelas turunan dari Hewan bernama Kucing
class Kucing extends Hewan {
    // Melakukan sebuah polymorfisme Dinamis yaitu Override dengan merubah bentuk class parent
    @Override
    void suara() {
        System.out.println("Meong");
    }
}
// Kelas turunan dari Hewan bernama Kucing
class Anjing extends Hewan {
    // Melakukan sebuah polymorfisme Dinamis yaitu Override dengan merubah bentuk class parent
    @Override
    void suara() {
        System.out.println("Guk Guk");
    }
}
