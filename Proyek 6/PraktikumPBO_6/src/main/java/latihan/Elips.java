/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author VOSTRO V131
 */
public class Elips extends Bentuk {
  // Method yang menjadi polimorfisme
    protected void gambar() {
        // Method asli gambar punya class bentuk yang dipolimorfisme
        System.out.println("subrclass -> Menggambar Elips");
    }
    
   // Method yang menjadi polimorfisme
    protected void hapus() {
        // Method asli hapus punya class bentuk yang dipolimorfisme
        System.out.println("subclass -> Menghapus Gambar Elips");
    }  
}
