/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author VOSTRO V131
 */
public class Makanan extends Produk{
     public String tanggalKadaluarsa;
    
    public Makanan (String namaProduk_, int harga_, String tanggalKadaluarsa_) {
        super(namaProduk_, harga_);
        this.tanggalKadaluarsa = tanggalKadaluarsa_;
    }
    
    @Override
    public void tampilkanInfo() {
//        System.out.println("Nama Produk : " + super.getNamaProduk());
//        System.out.println("Harga : " + this.getHarga());
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa : " + this.tanggalKadaluarsa);
    }
}
