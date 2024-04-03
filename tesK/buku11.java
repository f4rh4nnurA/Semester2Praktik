package tesK;

public class buku11 {

    String judul,pengarang ;
    int halaman, stok, harga;

    void tampilInformasi (){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    void terjual (int jml){
        stok -= jml;  
    }

    void restock (int jml) {
        stok += jml;
    }

    void gantiHarga (int hrg){
        harga = hrg;
    }

    public buku11() {

    }

    public buku11(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    int hitungHargaTotal(int jml) {
        return harga*jml;
    }

    int hitungDiskon (int hargaTotal) {
        int diskon = 0;
        if (hargaTotal > 150000 ) {
            diskon = (int) (hargaTotal*0.12);
        } else if (hargaTotal > 75000){
            diskon = (int) (hargaTotal*0.05);
        }
        return diskon;
    }

    int hitungHargaBayar (int hargaTotal , int diskon){
        return hargaTotal - diskon;
    }
}
