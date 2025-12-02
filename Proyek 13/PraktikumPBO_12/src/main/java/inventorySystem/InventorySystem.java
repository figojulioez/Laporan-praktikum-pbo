/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorySystem;

/**
 *
 * @author VOSTRO V131
 */
/**
 *
 * @author VOSTRO V131
 */
// Import semua library pada package io
import java.io.*;
// Library yang digunakan untuk membuat sebuah array
import java.util.ArrayList;
// Library yang digunakan untuk membuat sebuah list
import java.util.List;
// Library untuk menerima input dari berbagai sumber  seperti keyboard misalnya
import java.util.Scanner;

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

// Kelas utama pada pengimplementasian
public class InventorySystem {
    // atribut yang menyimpan nama file yang berfungsi menyimpan produk
    private static final String TEXT_FILE = "produk.txt";
    // atribut yang menyimpan nama file yang berfungsi menyimpan serialisasi objek produk
    private static final String SERIAL_FILE = "produk.ser";
    private static List<Produk> produkList = new ArrayList<>();

    public static void main(String[] args) {
        // Instansi scaner untuk menerima input dari seluruh system
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Simpan ke File Teks");
            System.out.println("3. Simpan Objek ke File (Serialisasi)");
            System.out.println("4. Tampilkan Semua Produk");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline
            // sebuah kondisi method mana yang dijalankan
            switch (pilihan) {
                case 1 -> tambahProduk(scanner);
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerial();
                case 4 -> tampilkanProduk();
                case 5 -> {
                    System.out.println("Keluar dari sistem.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

        // Method untuk menambahkan produk pada objek
    private static void tambahProduk(Scanner scanner) {
        System.out.print("Masukkan nama produk: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan harga: ");
        double harga = scanner.nextDouble();
        System.out.print("Masukkan stok: ");
        int stok = scanner.nextInt();
        produkList.add(new Produk(nama, harga, stok));
        System.out.println("Produk berhasil ditambahkan.");
    }

    // method untuk menyimpan list dari produk berupa string fi file produk.txt
    private static void simpanKeFileTeks() {
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Produk produk : produkList) {
                writer.write(produk.toString() + "\n");
            }
            System.out.println("Data produk berhasil disimpan ke file teks.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file teks.");
            e.printStackTrace();
        }
    }

    // method untuk menyimpan serial dari objek produk pada file produk.ser
    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(produkList);
            System.out.println("Objek produk berhasil disimpan ke file serial.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file serial.");
            e.printStackTrace();
        }
    }
    
    // method untuk menampilkan produk
    private static void tampilkanProduk() {
        System.out.println("Daftar Produk:");
        for (Produk produk : produkList) {
            produk.tampilkanInfo();
        }
    }
}
