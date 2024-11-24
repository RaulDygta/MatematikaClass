/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathraul;

/**
 *
 * @author LENOVO
 */
public class MatematikaCanggihBeraksiRaul {
    public static void main(String[] args) {
        // Membuat objek MatematikaCanggihRaul
        MatematikaCanggihRaul matCanggih = new MatematikaCanggihRaul();

        // Memanggil method pertambahan
        int hasilTambah = matCanggih.tambah(15, 10);
        System.out.println("Hasil Pertambahan: " + hasilTambah);

        // Memanggil method perkalian
        int hasilKali = matCanggih.kali(5, 4);
        System.out.println("Hasil Perkalian: " + hasilKali);

        // Memanggil method modulus
        int hasilModulus = matCanggih.modulus(17, 3);
        System.out.println("Hasil Modulus: " + hasilModulus);
    }
}
