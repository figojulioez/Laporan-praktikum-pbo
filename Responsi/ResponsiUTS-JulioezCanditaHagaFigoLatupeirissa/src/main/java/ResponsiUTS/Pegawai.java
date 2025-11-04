/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author VOSTRO V131
 */
public class Pegawai {
    private String namaPegawai;
    private int gaji;
    
    public Pegawai(String namaPegawai_, int gaji_) {
        this.setNamaPegawai(namaPegawai_);
        this.setGaji(gaji_);
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai : " + this.getNamaPegawai());
        System.out.println("Gaji : " + this.getGaji());
    }
    
    public void setNamaPegawai (String namaPegawai_) {
        this.namaPegawai = namaPegawai_;
    }
    
    public String getNamaPegawai () {
        return this.namaPegawai;
    }
    
    public void setGaji (int gaji_) {
        this.gaji = gaji_;
    }
    
    public int getGaji () {
        return this.gaji;
    }
    
}
