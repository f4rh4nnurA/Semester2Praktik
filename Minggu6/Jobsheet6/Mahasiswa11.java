package Minggu6.Jobsheet6;

public class Mahasiswa11 {
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa11(String n, int t, int u, double i){
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    void Tampil(){
        System.out.println("Nama = " + nama);
        System.out.println("Tahun Masuk = " + thnMasuk);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }

    
}