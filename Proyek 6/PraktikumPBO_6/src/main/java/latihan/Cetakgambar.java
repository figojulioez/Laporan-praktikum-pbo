/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author VOSTRO V131
 */

// Membuat class cetak gambar yang berinheritance pada class Bentuk
public class Cetakgambar extends Bentuk {
    // membuat method tampil yang menyimpan objek objek yang disatukan
    private void tampil(Bentuk[] obj) {
        // Contoh Polimorfisme
        /* Memanggil method yang sama yaitu method gambar dan hapus 
           pada setiap masing - masing class */
        for (int i = 0; i < obj.length; i++) {
            obj[i].gambar();
            obj[i].hapus();
            System.out.println("==================");
        }
    }
    
    public static void main (String[] args) {
        // Melakukan instansi pada setiap class yang berinheritance pada class Bentuk
        Bentuk[] obj = { new Lingkaran(), new Elips(), new Segitiga() };
      
        // Menginstansi cetakgambar
        Cetakgambar cetak = new Cetakgambar();
      
        // Menampilkan method gambar() & hapus() pada class Bentuk (superclass)
        cetak.gambar();
        cetak.hapus();
        System.out.println("==================");
        
        // Overriding
        // Menumpuk method gambar() & hapus() pada class Bentuk (superclass)
        // dengan method gambar() & hapus() pada subclass-nya
        // yaitu class Lingkaran, Elips, dan Segitiga
        cetak.tampil(obj);

    }
}
