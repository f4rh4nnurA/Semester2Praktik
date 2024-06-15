package UAS;

import coba.sorting;

public class BarangRental11 {
    String noTNKB;
    String namaKendaraan;
    String jenisKendaraan;
    int tahun;
    int biayaSewa;
    BarangRental11(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa){
        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa = biayaSewa;
    }

    void tampilkanKendaraan () {
        String noTNKB [] = {"S 4567 YV", "N 4511 VS", "N 1453 AA", "AB 4321 A", "B 1234 AG"};
        String namaKendaraan [] = {"Honda Beat", "Honda Vario", "Toyota Yaris", "Toyota Innova", "Toyota Avanza"};
        String jenis [] = {"Motor" , "Mobil"};
        int tahun [] = {2017, 2018, 2022, 2019, 2021};
        int biayaSewa [] = {10000, 10000, 30000, 60000, 25000};
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Daftar Kendaraan Rental Serba Serbi");
        System.out.println("++++++++++++++++++++++++");
        System.out.println("|" + "\tNomor TNKB" + "\t\t\t\tNama Kendaraan" + "\t\t\t\tJenis" + "\t\t\t\tTahun" + "\t\t\t\tBiaya Sewa Perjam" );
        System.out.println("|\t" + noTNKB[0] + "\t\t\t\t|" + namaKendaraan[0] + "\t\t\t\t|" + jenis[0] + "\t\t\t\t|" + tahun[0] + "\t\t\t\t|" + biayaSewa[0] );
        System.out.println("|\t" + noTNKB[1] + "\t\t\t\t|" + namaKendaraan[1] + "\t\t\t\t|" + jenis[0] + "\t\t\t\t|" + tahun[1] + "\t\t\t\t|" + biayaSewa[1] );
        System.out.println("|\t" + noTNKB[2] + "\t\t\t\t|" + namaKendaraan[2] + "\t\t\t\t|" + jenis[1] + "\t\t\t\t|" + tahun[2] + "\t\t\t\t|" + biayaSewa[2] );
        System.out.println("|\t" + noTNKB[3] + "\t\t\t\t|" + namaKendaraan[3] + "\t\t\t\t|" + jenis[1] + "\t\t\t\t|" + tahun[3] + "\t\t\t\t|" + biayaSewa[3] );
        System.out.println("|\t" + noTNKB[4] + "\t\t\t\t|" + namaKendaraan[4] + "\t\t\t\t|" + jenis[1] + "\t\t\t\t|" + tahun[4] + "\t\t\t\t|" + biayaSewa[4] );
    }
}
