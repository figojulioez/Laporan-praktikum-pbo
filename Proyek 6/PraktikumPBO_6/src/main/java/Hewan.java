/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VOSTRO V131
 */
// Membuat sebuah class hewan
public class Hewan {
    // Method bersuara milik hewan
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
    
    // Terjadinya overloading saat terdapat method dengan nama yang sama
    // Hanya saja method makan dibedakan melalui perbedaan parameter
    
    // Method makan yang akan dipanggil jika hanya mengirimkan 1 parameter saja
    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }

    // Method makan yang akan dipanggil jika hanya mengirimkan 2 parameter
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan makan " + jumlah + "porsi " + makanan);
 }

}
