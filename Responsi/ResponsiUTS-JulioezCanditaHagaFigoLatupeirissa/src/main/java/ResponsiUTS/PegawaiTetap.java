/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author VOSTRO V131
 */
public class PegawaiTetap extends Pegawai {
    public int tunjangan;
    
    public PegawaiTetap (String namaPegawai_, int gaji_, int tunjangan_) {
        super(namaPegawai_, gaji_);
        this.tunjangan = tunjangan_;
    }
    
    @Override
    public void tampilkanInfo() {
//        System.out.println("Nama Pegawai : " + super.getNamaPegawai());
//        System.out.println("Gaji : " + super.getGaji());
        super.tampilkanInfo();
        System.out.println("Tunjangan : " + this.tunjangan);
    }
}
