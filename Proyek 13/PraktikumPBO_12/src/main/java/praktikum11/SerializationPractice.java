/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author VOSTRO V131
 */
// Import semua library yang ada pada package java.io
import java.io.*;

// Kelas yang dapat diserialisasi
class Produk implements Serializable {
    // Membuat atribut yang dimana acess modifiernya private agar atributnya tidak bisa dimanipulasi diluar kode
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}

// Kelas yang akan mempraktikan serilization
public class SerializationPractice {
    public static void main(String[] args) {
        
        // Nama dari path pada file yang akan menyimpan sebuah objek tersebut
        String filePath = "produk.ser";

        // Membuat objek Produk
        Produk produk = new Produk("Laptop", 15000000, 10);

        // Menyimpan objek ke file (Serialisasi)
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            // Menulis objek tersebut kedalam file yang ada pada path 
            oos.writeObject(produk);
            System.out.println("Objek Produk berhasil disimpan ke file: " + filePath);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan objek.");
            e.printStackTrace();
        }

        // Membaca objek dari file (Deserialisasi)
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            // deserilialisasi objek pada file tersebut
            Produk deserializedProduk = (Produk) ois.readObject();
            System.out.println("\nObjek Produk berhasil dibaca dari file:");
            // Kemudian menjalankan method tampilkan Info
            deserializedProduk.tampilkanInfo();
            
          // Sebuah error handiling jika ditemukan bahwa file bukan sebuah objek  
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saat membaca objek.");
            e.printStackTrace();
        }
    }
}

