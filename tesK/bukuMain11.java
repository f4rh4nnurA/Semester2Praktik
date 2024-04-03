package tesK;

public class bukuMain11 {
    public static void main(String[] args) {
        buku11 bk1 = new buku11();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;  

        bk1.tampilInformasi();;
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        int hargaTotal = bk1.hitungHargaTotal(5);
        int diskon = bk1.hitungDiskon(hargaTotal);
        int hargaBayar = bk1.hitungHargaBayar(hargaTotal, diskon);
        System.out.println("Total Harga: " + hargaTotal);
        System.out.println("Diskon : " + diskon);
        System.out.println("Harga Bayar : " + hargaBayar);


        buku11 bk2 = new buku11("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
        int totalHarga = bk2.hitungHargaTotal(5);
        int diskonB = bk2.hitungDiskon(totalHarga);
        int hargaB = bk2.hitungHargaBayar(totalHarga, diskonB);
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Diskon : " + diskonB);
        System.out.println("Harga Bayar : " + hargaB);

        buku11 bk3 = new buku11("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk3.tampilInformasi();
        int hargaT = bk3.hitungHargaTotal(5);
        int diskonBarang = bk3.hitungDiskon(hargaT);
        int hargaPembayaran = bk3.hitungHargaBayar(hargaT, diskonBarang);
        System.out.println("Total Harga: " + hargaT);
        System.out.println("Diskon : " + diskonBarang);
        System.out.println("Harga Bayar : " + hargaPembayaran);
    }
}
