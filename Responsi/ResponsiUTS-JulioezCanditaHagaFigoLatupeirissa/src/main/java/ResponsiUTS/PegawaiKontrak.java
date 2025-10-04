/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author VOSTRO V131
 */
public class PegawaiKontrak extends Pegawai{
    public int kontrak;
    
    public PegawaiKontrak (String namaPegawai_, int gaji_, int kontrak_) {
        super(namaPegawai_, gaji_);
        this.kontrak = kontrak_;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai : " + super.getNamaPegawai());
        System.out.println("Gaji : " + super.getGaji());
        System.out.println("Lama Kontrak : " + this.kontrak + " bulan");
    }
}
