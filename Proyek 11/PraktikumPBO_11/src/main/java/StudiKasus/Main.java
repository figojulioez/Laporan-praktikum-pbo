/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudiKasus;

/**
 *
 * @author VOSTRO V131
 */

public class Main {
    public static void main(String[] args) {
        
        // ================================
        //   UJI AGREGASI (Buku - Pengarang)
        // ================================
        
        // Membuat objek Pengarang secara terpisah
        // Ini menunjukkan bahwa Pengarang dapat hidup tanpa Buku (agregasi)
        Pengarang pengarang1 = new Pengarang("Tere Liye");
        Pengarang pengarang2 = new Pengarang("Andrea Hirata");
        
        
        // Membuat objek Buku dengan menyertakan objek Pengarang
        // Buku tidak membuat pengarang sendiri, tetapi menerima dari luar → agregasi
        Buku buku1 = new Buku("Negeri Para Bedebah", pengarang1);
        Buku buku2 = new Buku("Laskar Pelangi", pengarang2);
        
        
        // ================================
        //        UJI KOMPOSISI
        // ================================
        
        // Membuat objek Perpustakaan sebagai objek utama
        Perpustakaan perpustakaan = new Perpustakaan();
        
        // Menambahkan objek buku ke dalam Perpustakaan
        // Buku menjadi bagian penuh dari Perpustakaan → komposisi
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        
        
        // ================================
        //     MENAMPILKAN INFORMASI
        // ================================
        
        System.out.println("===== INFORMASI PERPUSTAKAAN =====");
        perpustakaan.infoPerpustakaan();
        
        System.out.println("\n===== INFORMASI PENGARANG =====");
        pengarang1.infoPengarang();
        pengarang2.infoPengarang();
    }
}

