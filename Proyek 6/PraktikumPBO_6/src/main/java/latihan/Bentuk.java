/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author VOSTRO V131
 */
// Membuat class bentuk
public class Bentuk {
    // Method yang nantinya digunakan untuk polimorfisme
    protected void gambar() {
        // Method asli gambar punya class bentuk
        System.out.println("superclass -> Menggambar ");
    }
    
    // Method yang nantinya digunakan untuk polimorfisme
    protected void hapus() {
        // Method asli punya class bentuk
        System.out.println("superclass -> Menghapus Gambar ");
    }
}
