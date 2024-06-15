package UAS;

public class TransaksiRental11 {
    int kodeTransaksi;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    BarangRental11 br;
    TransaksiRental11 (int kodeTransaksi, String namaPeminjam, int lamaPinjam, double totalBiaya, BarangRental11 br){
        this.kodeTransaksi = kodeTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.totalBiaya = totalBiaya;
    }
}
