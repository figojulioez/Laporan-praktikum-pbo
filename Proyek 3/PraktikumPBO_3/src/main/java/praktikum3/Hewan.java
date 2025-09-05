/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author VOSTRO V131
 */
public class Hewan {
    // Membuat sebuah atribut dengan tipe data string bernama nama
    // Modifier dibuat private agar tidak bisa digunakan diluar class atau saat class di instansi
    private String nama;
    // membuat sebuah atribut dengan tipe data integer bernama umur
    // Modifier dibuat public agar tidak bisa digunakan diluar class atau saat class di instansi
    private int umur;
    
    // Membuat sebuah method costructor ditandai dengan nama method sama dengan nama class
    // Method ini digunakan untuk menginisasi atribut atribut Hewan
    public Hewan (String nama, int umur) {
        // Mengisi atribut dengan nilai argument yang diberikan saat class diinstansi
        this.setNama(nama);
        this.setUmur(umur);
    }
    
    // membuat setter untuk atribut umur agar bisa diubah
    public void setUmur (int umur) {
        this.umur = umur;
    }
    // membuat getter untuk atribut umur agar bisa mendapatkan nilai dari umur
    // karena tipe data dari method int maka akan mengembalikan nilai dengan tipe data integer
    public int getUmur () {
        return this.umur;
    }
    
    // membuat setter untuk atribut nama agar bisa diubah
    public void setNama (String nama) {
        this.nama = nama;
    }
    // membuat getter untuk atribut nama agar bisa mendapatkan nilai dari atribut nama
    // karena tipe data dari method String maka akan mengembalikan nilai dengan tipe data String
    public String getNama () {
        return this.nama;
    }
           
    // Sebuah method void (fungsi yang tidak mengembalikan nilai) bernama suara untuk menampilkan pesan
    // Modifier di setel public agar bisa diakses di luar class sekalipun
    public void suara () {
        // Saat method suara dipanggil akan menampilkan pesan ini
        System.out.println("Hewan Bersuara");
    }
    
    // Sebuah method void (fungsi yang tidak mengembalikan nilai) bernama berlari untuk menampilkan pesan
    // Modifier di setel public agar bisa diakses di luar class sekalipun
    public void berlari () {
        // Saat method suara dipanggil akan menampilkan pesan ini
        System.out.println("Hewan sedang berlari");
    }
    
    // Sebuah method void (fungsi yang tidak mengembalikan nilai) bernama suara untuk menampilkan pesan
    // Modifier di setel public agar bisa diakses di luar class sekalipun
    public void info () {
        // Pindahkan nilai dari atribut ke dalam variabel baru
        String namaHewan = this.getNama();
        int umurHewan = this.getUmur();
        
        System.out.println("Nama dari hewan : " + namaHewan);
        System.out.println("Umur dari hewan : " + umurHewan);

    }
    
}
