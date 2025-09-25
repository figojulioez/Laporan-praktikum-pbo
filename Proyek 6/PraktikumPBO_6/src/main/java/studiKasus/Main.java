/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studiKasus;

/**
 *
 * @author VOSTRO V131
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja(5); // kapasitas 5 produk

        // Tambah produk
        keranjang.tambahProduk(new Buku("Buku Java", 100000));
        keranjang.tambahProduk(new Elektronik("Headphone", 500000));
        keranjang.tambahProduk(new Pakaian("Kaos", 150000));

        // Tampilkan produk
        keranjang.tampilkanProduk();

        // Hitung total
        System.out.println("Total setelah diskon: Rp" + keranjang.hitungTotalSetelahDiskon());
    }
}

