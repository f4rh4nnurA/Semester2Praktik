package Minggu7.TestSearching;

public class PencarianBuku11 {
    Buku11 listBk [] = new Buku11[5];
    int idx;

    void tambah (Buku11 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku11 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch (int cari){
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku != cari) {
                j = posisi;
                break;
            } 
        }
        return posisi;
    }

    public void TampilPosisi (int x, int pos) {
        if (pos != -1 ) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos){
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t\t : " + listBk[pos].stock);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void FindBuku (){
        
    }
}
