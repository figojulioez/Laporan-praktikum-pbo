/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VOSTRO V131
 */
// Membuat sebuah class utama bernama klub
public class Klub {
    // atribut yang berfungsi untuk menyimpan informasi setiap klub
    private String namaKlub;
    // atribut yang berfungsi untuk menyimpan List dari objek Anggota
    private List<Anggota> anggotaList;
    
    // Method constructor Klub
    public Klub(String namaKlub_) {
        // Simpan informasi mengenai namaKlub kedalam atribut klub
        this.namaKlub = namaKlub_;
        
        // Mengistansi class bawaan java ArrayList untuk membuat sebuah array
        this.anggotaList = new ArrayList<>();
    }
    
    // Method untuk menambahkan objek Anggota kedalam Atribut Klub
    public void tambahAnggota(Anggota anggota) {
        // Tambahkan objek anggota kedalam anggotaList
        this.anggotaList.add(anggota);
    }
    
    // Method untuk menampilkan informasi dari seluruh anggota
    public void infoKlub() {
        System.out.println("Nama Klub: " + this.namaKlub);
        // Lakukan looping untuk setiap isi dari anggotaList
        for (Anggota anggota : anggotaList) {
           anggota.infoAnggota();
       }
    }
}
// Membuat sebuah class tunggal bernama Anggota
class Anggota {
    // Atribut yang berfungsi untuk menyimpan informasi nama
    private String nama;
    
    // Method constructor Anggota
    public Anggota(String nama_) {
        // Simpan informasi mengenai nama anggota pada atribut nama
        this.nama = nama_;
    }

    // Method untuk menampilkan informasi mengenai anggota
    public void infoAnggota() {
        // Tampilkan nama dari anggota
        System.out.println("Nama Anggota: " + this.nama);
    }
}
