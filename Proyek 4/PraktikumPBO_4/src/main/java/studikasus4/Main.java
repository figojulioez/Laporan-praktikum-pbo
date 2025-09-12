/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikasus4;

/**
 *
 * @author VOSTRO V131
 */
public class Main {
    public static void main (String[] args) {
       // menginstansi class pekerja dan merubahnya jadi objek WebDeveloper
        Pekerja WebDeveloper = new Pekerja("Figo", 19, "Web Developer", 2000);
       
        // menampilkan informasi pekerja dengan method toString()
        System.out.println(WebDeveloper.toString());
        
        // mengubah informasi nama dengan setter
        WebDeveloper.setNama("Kana");
        
/* Maka otomatis saat kita tampilkan nama akan langsung berganti karena kita sudah
   merubah atribut nama dengan setter */
        System.out.println(WebDeveloper.toString());
        
//        System.out.println(WebDeveloper.nama);
//        System.out.println(WebDeveloper.gaji);
//        System.out.println(WebDeveloper.usia);
    }
    
}
