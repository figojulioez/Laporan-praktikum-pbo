/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author VOSTRO V131
 */
public class Produk {
    private String namaProduk;
    private int harga;
    
    public Produk (String namaProduk_, int harga_) {
        this.namaProduk = namaProduk_;
        this.harga = harga_;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Produk : " + this.namaProduk);
        System.out.println("Harga : " + this.harga);
    }
    
    public void setNamaProduk (String namaProduk_) {
        this.namaProduk = namaProduk_;
    }
    
    public String getNamaProduk () {
        return this.namaProduk;
    }
    
    public void setHarga (int harga_) {
        this.harga = harga_;
    }
    
    public int getHarga () {
        return this.harga;
    }
}

