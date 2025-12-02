/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author VOSTRO V131
 */

// Import library FileWriter berfungsi untuk menulis file
import java.io.FileWriter;
// Import library FileReader berfungsi untuk membaca file
import java.io.FileReader;
// Import IOException berfungsi untuk menerima error dari java
import java.io.IOException;

// Membuat sebuah class FileIOPractice untuk memanipulasi file
public class FileIOPractice {
    
    public static void main(String[] args) {
        
        // Nama file yang akan di manipulasi
        String filePath = "data.txt";

        // Menulis data ke file
        // Menggunakan error handling agar apabila terjadi kesalahan pada penulisan file tidak menampilkan error
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Belajar File I/O di Java!\n");
            writer.write("Pemrograman Berorientasi Objek.\n");
            System.out.println("Data berhasil ditulis ke file: " + filePath);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file.");
            e.printStackTrace();
        }

        // Membaca data dari file
        // Menggunakan error handling agar apabila terjadi kesalahan pada penulisan file tidak menampilkan error
        try (FileReader reader = new FileReader(filePath)) {
            // Membuat variabel character yang nanti digunakan untuk membaca setiap characternya
            int character;
            System.out.println("\nIsi file:");
            
            // reader.read akan mengembalikan angka yang nantinya akan disimpan pada character
            while ((character = reader.read()) != -1) {
                // lalu angka yang ditermia character akan di ubah tipe datanya dari int menjadi char
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file.");
            e.printStackTrace();
        }
    }
}

