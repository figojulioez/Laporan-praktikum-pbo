/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplikasiperpustakaan;

/**
 *
 * @author VOSTRO V131
 */

// Import Scanner untuk input dari CMD
import java.util.Scanner;

public class AplikasiPerpustakaan {

     // Method main
    public static void main(String[] args) {

        // Membuat objek Scanner
        Scanner input = new Scanner(System.in);

        try {
            // Input data anggota
            System.out.print("Masukkan ID Anggota   : ");
            String idAnggota = input.nextLine();

            System.out.print("Masukkan Nama Anggota : ");
            String nama = input.nextLine();

            Anggota anggota = new Anggota(idAnggota, nama);

            // Input data buku
            System.out.print("Masukkan ID Buku      : ");
            String idBuku = input.nextLine();

            System.out.print("Masukkan Judul Buku   : ");
            String judul = input.nextLine();

            System.out.print("Masukkan Pengarang    : ");
            String pengarang = input.nextLine();

            Buku buku = new Buku(idBuku, judul, pengarang);

            // Proses peminjaman
            Peminjaman peminjaman = new Peminjaman(anggota);
            peminjaman.tambahBuku(buku);

            System.out.println("\n=== PROSES PEMINJAMAN ===");
            peminjaman.pinjam();

            // Simpan data perpustakaan
            Perpustakaan perpus = new Perpustakaan();
            perpus.tambahAnggota(anggota);

            DataManager.simpanData(perpus, "perpustakaan.dat");

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            // Menutup Scanner
            input.close();
        }
    }
}
