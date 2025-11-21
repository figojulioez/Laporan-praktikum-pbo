/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author VOSTRO V131
 */
 // Class utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        
        // ===============================
        //   UJI KONSTRUKSI KOMPOSISI
        // ===============================
        // Membuat objek Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();
        
        // Menambahkan objek Buku langsung ke dalam perpustakaan
        perpustakaan.tambahBuku(new Buku("Belajar Java Dasar"));
        perpustakaan.tambahBuku(new Buku("Pemrograman Berorientasi Objek"));
        
        // Menampilkan seluruh informasi buku yang ada di perpustakaan
        System.out.println("=== Info Perpustakaan (Komposisi) ===");
        perpustakaan.infoPerpustakaan();


        // ===============================
        //   UJI KONSTRUKSI AGREGASI
        // ===============================
        // Membuat objek Klub
        Klub klub = new Klub("Klub Pecinta Alam");
        
        // Membuat objek Anggota secara terpisah
        Anggota anggota1 = new Anggota("Budi");
        Anggota anggota2 = new Anggota("Sari");
        
        // Menambahkan anggota ke dalam klub
        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);
        
        // Menampilkan info mengenai klub dan anggotanya
        System.out.println("\n=== Info Klub (Agregasi) ===");
        klub.infoKlub();
    }
}   
