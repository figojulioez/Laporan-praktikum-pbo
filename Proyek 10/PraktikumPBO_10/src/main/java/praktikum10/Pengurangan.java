/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author VOSTRO V131
 */

/** Memmbuat kelas pengurangan yang mengimplementasikan OperasiHitung
 * yang artinya semua yang ada pada interface OperasiHitung merupakan perilaku wajib dari 
 * kelas Pengurangan
**/ 
public class Pengurangan implements OperasiHitung {
    /** Polimorfisme class pengurangan pada method interface OperasiHitung karena definisinya tidak lengkap
    * dan perilakunya berbeda beda setiap class
    **/
    @Override
    public int hitung(int a, int b) {
        return a -  b;
    }
}
