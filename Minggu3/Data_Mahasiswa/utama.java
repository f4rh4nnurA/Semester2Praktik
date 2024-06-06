package Data_Mahasiswa;

public class utama {
    public static void main(String[] args) {
        Mahasiswa mhs [] = new Mahasiswa[3];
        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa(null, i, null, null);
            mhs[i].inputData();
        } 
        for (int i = 0; i < mhs.length; i++) {
            mhs[i].tampilkanInformasi();
        }
    }
}