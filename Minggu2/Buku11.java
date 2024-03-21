package Minggu2;

import java.util.Scanner;

public class Buku11 {
    static String judul, pengarang;
    static int halaman, stok, diskon, harga;
    
    public static void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    public Buku11(){

    }

    public Buku11 (String jud, String pg, int hal,  int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    Buku11 bukuFarhan = new Buku11("Makanan Sehat", "Muhammad", 65, 20, 30000);

    void terjual (int jml) {
        if (stok > 0) {
            stok -= jml;    
        } else {
            stok = 0;
        }
    }

    void restock (int n) {
        stok += n;
    }

    int gantiHarga (int hrg){
        harga = hrg;
        return harga;
    }

    int hitungHargaTotal(int terjual){
        int hargaTotal = harga*terjual;
        return hargaTotal;
    }

    int hitungDiskon(int hargaTotal){
        if (hargaTotal > 150000) {
            diskon = hargaTotal*12/100;
        } else if ((hargaTotal <= 150000) && (hargaTotal >= 150000)) {
            diskon = hargaTotal*5/100;
        } else if (hargaTotal < 75000) {
            diskon = 0;
        }
        return diskon;
    }

    int hitungHargaBayar(int hargaTotal, int diskon){
        int hargaBayar = hargaTotal - diskon;
        return hargaBayar;
    }
}