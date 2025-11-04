/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author VOSTRO V131
 */
public class Elektronik extends Produk {
    public int tahun;
    
    public Elektronik (String namaProduk_, int harga_, int tahun_) {
        super(namaProduk_, harga_);
        this.tahun = tahun_;
    }
    
    @Override
    public void tampilkanInfo() {
//        System.out.println("Nama Produk : " + super.getNamaProduk());
//        System.out.println("Harga : " + this.getHarga());
        super.tampilkanInfo();
        System.out.println("Garansi : " + this.tahun + " tahun");
    }
}
