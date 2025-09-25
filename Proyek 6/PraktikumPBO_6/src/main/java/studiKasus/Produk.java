/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studiKasus;

/**
 *
 * @author VOSTRO V131
 */
// Kelas Abstrak
abstract class Produk {
    // Membuat atribut untuk menyimpan beberapa atribut - atribut
    protected String nama;
    protected double harga;

    // Method constructor untuk menginisiasi atributnya
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Method abstrak untuk dihitung di tiap turunan
    public abstract double hitungDiskon();

     // Method untuk mendapatkan harga setelah terjadi diskon
    public double getHargaSetelahDiskon() {
        return harga - hitungDiskon();
    }

    // Enakapsulasi method nama atau getter nama
    public String getNama() {
        return nama;
    }

    // Enakapsulasi method harga atau getter harga
    public double getHarga() {
        return harga;
    }
}

// Kelas turunan Buku
class Buku extends Produk {
    // Method constructor untuk mengiisiasi nama dan harga milik buku melalui atribut Produk
    public Buku(String nama, double harga) {
        super(nama, harga);
    }

    // Melakukan ovveride pada method hitung diskon dimana diskonnya 10%
    @Override
    public double hitungDiskon() {
        // Diskon 10% untuk buku
        return harga * 0.10;
    }
}

// Kelas turunan Elektronik
class Elektronik extends Produk {
    // Method constructor untuk mengiisiasi nama dan harga milik Elektronik melalui atribut Produk
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }

    // Melakukan ovveride pada method hitung diskon dimana diskonnya 5%
    @Override
    public double hitungDiskon() {
        // Diskon 5% untuk elektronik
        return harga * 0.05;
    }
}

// Kelas turunan Pakaian
class Pakaian extends Produk {
    // Method constructor untuk mengiisiasi nama dan harga milik Pakaian melalui atribut Produk
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }

    // Melakukan ovveride pada method hitung diskon dimana diskonnya 5%
    @Override
    public double hitungDiskon() {
        // Diskon 20% untuk pakaian
        return harga * 0.20;
    }
}

// Kelas KeranjangBelanja
class KeranjangBelanja {
    // Atribut private yang nantinya akan menyimpan daftarProduk dalam bentuk array yang berisi objek objek
    private Produk[] daftarProduk;
    private int jumlahProduk;

    // Method constructor dimana saat method di instansi akan mengistansi atributnya
    public KeranjangBelanja(int kapasitas) {
        // daftarproduk akan di isi array dimana array nya merupakan referensi dari produk
        daftarProduk = new Produk[kapasitas];
        jumlahProduk = 0;
    }

    // Method untuk menambah produk 
    public void tambahProduk(Produk produk) {
        if (jumlahProduk < daftarProduk.length) {
            daftarProduk[jumlahProduk] = produk;
            jumlahProduk++;
        } else {
            System.out.println("Keranjang penuh!");
        }
    }

     // Method untuk menhitunga total harga setelah diskon
    public double hitungTotalSetelahDiskon() {
        double total = 0;
        for (int i = 0; i < jumlahProduk; i++) {
            total += daftarProduk[i].getHargaSetelahDiskon();
        }
        return total;
    }

    public void tampilkanProduk() {
        for (int i = 0; i < jumlahProduk; i++) {
            Produk p = daftarProduk[i];
            System.out.println(p.getNama() +
                    " | Harga: Rp" + p.getHarga() +
                    " | Setelah Diskon: Rp" + p.getHargaSetelahDiskon());
        }
    }
}

