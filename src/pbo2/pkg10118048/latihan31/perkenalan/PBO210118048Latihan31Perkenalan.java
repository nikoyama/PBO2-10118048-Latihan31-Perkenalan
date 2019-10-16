/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan31.perkenalan;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menampilkan nama dan nim mahasiswa
 */
public class PBO210118048Latihan31Perkenalan {

    public static void main(String[] args) {
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nim = "10110269";
        mahasiswa.nama = "Rizki Adam Kurniawan";
        mahasiswa.perkenalanDiri();
        
        mahasiswa.nim = "10110270";
        mahasiswa.nama = "Indra Tiola";
        mahasiswa.perkenalanDiri();
        
        mahasiswa.nim = "10110271";
        mahasiswa.nama = "Robi Tansil Ganefi";
        mahasiswa.perkenalanDiri();
        
        mahasiswa.nim = "10110269";
        mahasiswa.nama = "Muhammad Nur Awaludin";
        mahasiswa.perkenalanDiri();
    }

}
