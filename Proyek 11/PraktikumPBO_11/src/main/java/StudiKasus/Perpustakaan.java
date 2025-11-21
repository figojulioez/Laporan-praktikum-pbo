/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudiKasus;

/**
 *
 * @author VOSTRO V131
 */
// Import library java untuk membuat sebuah array list
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VOSTRO V131
 */
// Membuat class utama yaitu perpustakaan
public class Perpustakaan {
   // Menyiapkan atribut bernama daftarBuku yang nantinya akan menyimpan kumpulan objek buku dalam bentuk list
   private List<Buku> daftarBuku;
   
   // Method Constructor perpustakaan
   public Perpustakaan() {
       // Menngistasnsi objek arraylist bawaan java untuk membuat sebuah array 
       this.daftarBuku = new ArrayList<>();
   }
   
   // Method untuk menambahkan buku nantinya
   public void tambahBuku(Buku buku) {
       // Tambahkan objek buku kedalam array
       daftarBuku.add(buku);
   }
   
   // Method untuk melihat seluruh informasi dari buku
   public void infoPerpustakaan() {
       // Lakukan looping untuk setiap isi dari daftarBuku
       for (Buku buku : daftarBuku) {
           buku.infoBuku();
           buku.infoPengarang();
       }
   }
}

// Membuat class komposisi dari perpustakaan yaitu Buku
class Buku {
    // Membuat atribut judul untuk menyimpan informasi mengenai judul tersebut
    private String judul;
    // Membuat atribut Pengarang yang akan menyimpan objek pengarang
    private Pengarang pengarang;
    
    // Method constructor buku
    public Buku(String judul_, Pengarang pengarang_) {
        // Menyimpan informasi mengenai judul pada atribut judul
        this.judul = judul_;
        // Menyimpan instansi dari class Pengarang
        this.pengarang = pengarang_;
    }
    
    // Method untuk menampilkan informasi dari buku
    public void infoBuku() {
        System.out.println("Judul Buku : " + this.judul);
    }
    
    // Method untuk menampilkan informasi dari pengarang
   public void infoPengarang() {
        this.pengarang.infoPengarang();
    }
}


// Kelas Pengarang (akan dihubungkan ke Buku sebagai agregasi)
class Pengarang {
    // Menyimpan nama pengarang
    private String namaPengarang;   

    // Constructor Pengarang
    public Pengarang(String nama_) {
        this.namaPengarang = nama_;
    }

    // Menampilkan info pengarang
    public void infoPengarang() {
        System.out.println("Pengarang   : " + this.namaPengarang);
    }
}