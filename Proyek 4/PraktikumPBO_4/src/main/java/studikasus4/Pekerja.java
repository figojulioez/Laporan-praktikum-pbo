/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikasus4;

/**
 *
 * @author VOSTRO V131
 */
public class Pekerja extends Manusia {
    // Modifier gaji private maka hanya bisa diakses pada classnya sendiri
    private int gaji;
    
    /* Membuat sebuah constructor untuk menginisasi atribut parrentnya dan atribut 
         yang terdapat di class parentnya juga */
    public Pekerja(String nama, int usia, String pekerjaan, int gaji) {
       // Menginisiasi class parentnya
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    
    // membuat sebuah setter dan getter untuk menjaga kemanan privasi dari atribut gaji
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    public int getGaji() {
        return this.gaji;
    }
    
    // dengan tujuan untuk menambahkan gaji
    @Override 
    public String toString() {
        // super itu merujuk pada class parentnya
        String namaManusia = super.getNama();
        String pekerjaanManusia = this.pekerjaan;
        int usiaManusia = this.usia;
        int gajiManusia = this.getGaji();
        return "Nama manusia adalah " + namaManusia +
           "\nUsia berumur " + usiaManusia + " tahun" +
           "\nPekerjaannya adalah " + pekerjaanManusia +
           "\nGajinya berjumlah " + gajiManusia;
    }
}   