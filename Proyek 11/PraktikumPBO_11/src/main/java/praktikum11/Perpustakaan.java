/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

// Import library java untuk membuat sebuah array list
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VOSTRO V131
 */
// Membuat class utama yaitu perpustakaan
public class Perpustakaan {
   // Menyiapkan atribut bernama bukuList yang nantinya akan menyimpan kumpulan objek buku dalam bentuk list
   private List<Buku> bukuList;
   
   // Method Constructor perpustakaan
   public Perpustakaan() {
       // Menngistasnsi objek arraylist bawaan java untuk membuat sebuah array 
       this.bukuList = new ArrayList<>();
   }
   
   // Method untuk menambahkan buku nantinya
   public void tambahBuku(Buku buku) {
       // Tambahkan objek buku kedalam array
       bukuList.add(buku);
   }
   
   // Method untuk melihat seluruh informasi dari buku
   public void infoPerpustakaan() {
       // Lakukan looping untuk setiap isi dari bukuList
       for (Buku buku : bukuList) {
           buku.infoBuku();
       }
   }
}

// Membuat class komposisi dari perpustakaan yaitu Buku
class Buku {
    // Membuat atribut judul untuk menyimpan informasi mengenai judul tersebut
    private String judul;
    
    // Method constructor buku
    public Buku(String judul_) {
        // Menyimpan informasi mengenai judul pada atribut judul
        this.judul = judul_;
    }
    
    // Method untuk menampilkan informasi dari buku
    public void infoBuku() {
        System.out.println("Judul Buku : " + this.judul);
    }
}


