/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResponsiUTS;

/**
 *
 * @author VOSTRO V131
 */
public class Main {
     public static void main(String[] args) {
        Produk laptop = new Elektronik("Laptop", 15000000, 2);
        laptop.tampilkanInfo();

        System.out.println();

        Pegawai figo = new PegawaiTetap("Julioez Candita Haga Figo Latupeirissa", 5000000, 1000000);
        figo.tampilkanInfo();

        System.out.println();

        Produk snack = new Makanan("Snack", 15000, "2023-12-30");
        Pegawai andi = new PegawaiKontrak("Andi", 3000000, 12);

        snack.tampilkanInfo();
        System.out.println();
        andi.tampilkanInfo();
    }
}
