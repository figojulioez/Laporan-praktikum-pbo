package inventorySystem;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VOSTRO V131
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Kelas yang dapat diserialisasi
class Buku implements Serializable {
    // Membuat atribut private agar tidak bisa diakses langsung dari luar
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Method untuk menampilkan info buku
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }

    // Optional: agar tampil saat disimpan ke file teks
    @Override
    public String toString() {
        return judul + " | " + pengarang + " | " + tahunTerbit;
    }
}

// Kelas utama pada pengimplementasian
public class BukuSystem {
    // atribut yang menyimpan nama file untuk menyimpan data buku
    private static final String TEXT_FILE = "buku.txt";
    // atribut yang menyimpan nama file untuk menyimpan serialisasi objek buku
    private static final String SERIAL_FILE = "buku.ser";
    // List untuk menampung semua objek Buku sementara
    private static List<Buku> bukuList = new ArrayList<>();

    public static void main(String[] args) {
        // Instansi scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Simpan ke File Teks");
            System.out.println("3. Simpan Objek ke File (Serialisasi)");
            System.out.println("4. Tampilkan Semua Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            // menentukan method mana yang dijalankan berdasarkan pilihan
            switch (pilihan) {
                case 1 -> tambahBuku(scanner);
                case 2 -> simpanKeFileTeks();
                case 3 -> simpanKeFileSerial();
                case 4 -> tampilkanBuku();
                case 5 -> {
                    System.out.println("Keluar dari sistem.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    // Method untuk menambahkan buku pada list
    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan pengarang: ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan tahun terbit: ");
        int tahun = scanner.nextInt();
        bukuList.add(new Buku(judul, pengarang, tahun));
        System.out.println("Buku berhasil ditambahkan.");
    }

    // Method untuk menyimpan list buku ke file teks
    private static void simpanKeFileTeks() {
        try (FileWriter writer = new FileWriter(TEXT_FILE)) {
            for (Buku buku : bukuList) {
                writer.write(buku.toString() + "\n");
            }
            System.out.println("Data buku berhasil disimpan ke file teks.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file teks.");
            e.printStackTrace();
        }
    }

    // Method untuk menyimpan serialisasi objek buku ke file .ser
    private static void simpanKeFileSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(bukuList);
            System.out.println("Objek buku berhasil disimpan ke file serial.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file serial.");
            e.printStackTrace();
        }
    }

    // Method untuk menampilkan daftar buku
    private static void tampilkanBuku() {
        System.out.println("Daftar Buku:");
        for (Buku buku : bukuList) {
            buku.tampilkanInfo();
        }
    }
}

