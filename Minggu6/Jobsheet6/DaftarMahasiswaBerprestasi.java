package Minggu6.Jobsheet6;

public class daftarMahasiswaBerprestasi {
    Mahasiswa11 listMhs[] = new Mahasiswa11[5];
    int idx;

    void tambah(Mahasiswa11 m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil(){
        for (Mahasiswa11 m : listMhs) {
            m.tampil();
            System.out.println("-------------------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++){
            for (int j = 1; j < listMhs.length-i-1; j++) {
                if (listMhs[j].ipk > listMhs [j - 1].ipk) {
                    Mahasiswa11 tmp = listMhs[j];
                    listMhs[j] = listMhs [j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }


}
