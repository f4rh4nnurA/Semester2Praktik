package Minggu7.TestSearching;

import java.util.Scanner;

public class BukuMain11 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Scanner s1 = new Scanner (System.in);

        PencarianBuku11 data = new PencarianBuku11();
        int jumBuku = 5;
        
        System.out.println("==============================================");
        System.out.println("Masukkan data Buku secara urut dari kodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("=================");
            System.out.println("Kode buku \t: " );
            int kodeBuku = s.nextInt();
            System.out.println("Judul buku \t : " );
            String judulBuku = s1.nextLine();
            System.out.println("Tahun Terbit \t :");
            int tahunTerbit = s.nextInt();
            System.out.println("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.println("Stock \t  : ");
            int stock = s.nextInt();

            Buku11 m = new Buku11(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("===================================");
        System.out.println("Data keseluruhan mahasiswa : ");
        System.out.println("===================================");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan kode buku yang dicari : ");
        System.out.println("Kode buku : ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}

