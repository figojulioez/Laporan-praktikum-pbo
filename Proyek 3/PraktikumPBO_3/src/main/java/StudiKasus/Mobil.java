/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudiKasus;

/**
 *
 * @author VOSTRO V131
 */


public class Mobil {
    // Membuat sebuah atribut merek, model, dan tahun
    // Modifier atribut diberikan private agar tidak bisa di akses di luar class atau turunannya
    private String merek;
    private String model;
    private int tahun;
    private String warna;
    
    // Membuat sebuah method costructor ditandai dengan nama method sama dengan nama class
    // Method ini digunakan untuk menginisasi atribut atribut Mobil
    public Mobil(String merek, String model, int tahun, String warna) {
        // Menggisi atribut dengan nilai dari argument yang duberikan saat constructor di insiasi
        this.setMerek(merek);
        this.setModel(model);
        this.setTahun(tahun);
        this.setWarna(warna);
    }
    
    // Sebuah method void (fungsi yang tidak mengembalikan nilai) bernama detailInfo untuk menampilkan pesan
    // Modifier di setel public agar bisa diakses di luar class sekalipun
    public void detailInfo() {
        // Mendeklarasikan variabel yang nantinya variabel variabel ini akan menyimpan nilai dari atribut
        String merekMobil = this.getMerek();
        String modelMobil = this.getModel();
        int tahunMobil = this.getTahun();
        String warnaMobil = this.getWarna();
        
        System.out.println("Merek dari mobil adalah " + merekMobil);
        System.out.println("Model dari mobil adalah " + modelMobil);
        System.out.println("Mobil merupakan keluaran tahun " + tahunMobil);
        System.out.println("Mobil ini berwarna " + warnaMobil);
    }
    
    
    
    // Sebuah method void (fungsi yang tidak mengembalikan nilai) bernama startEngine untuk menampilkan pesan
    // Modifier di setel public agar bisa diakses di luar class sekalipun
    public void startEngine() {
        // mendapatkan nilai dari atribut merek
        String merekEngine = this.getMerek();
        
        // Menampilkan pesan bahwa mesin sudah menyala
        System.out.println("Mesin mobi " + merekEngine + " Menyala");
    }
    
    // membuat setter untuk atribut merek agar bisa merubah atau mengisi nilai dari atribut merek
    public void setMerek (String merek) {
        this.merek = merek;
    }
    
    // membuat setter untuk atribut model agar bisa merubah atau mengisi nilai dari atribut model
    public void setModel (String model) {
        this.model = model;
    }
    
    // membuat setter untuk atribut tahun agar bisa merubah atau mengisi nilai dari atribut tahun
    public void setTahun (int tahun) {
        this.tahun = tahun;
    }
    
     // membuat setter untuk atribut warna agar bisa merubah atau mengisi nilai dari atribut warna
    public void setWarna (String warna) {
        this.warna = warna;
    }
    
    // membuat getter untuk atribut merek agar bisa mendapatkan nilai dari atribut merek
    // tipe data dari method String karena akan mengembalikan nilai string
    public String getMerek () {
        return this.merek;
    }
    
    // membuat getter untuk atribut model agar bisa mendapatkan nilai dari atribut model
    // tipe data dari method String karena akan mengembalikan nilai string
    public String getModel () {
        return this.model;
    }
    
    // membuat getter untuk atribut tahun agar bisa mendapatkan nilai dari atribut tahun
    // tipe data dari method int karena akan mengembalikan nilai integer
    public int getTahun () {
        return this.tahun;
    }
    
    // membuat getter untuk atribut warna agar bisa mendapatkan nilai dari atribut warna
    // tipe data dari method String karena akan mengembalikan nilai string
    public String getWarna () {
        return this.warna;
    }
}
