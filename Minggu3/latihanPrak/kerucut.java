package latihanPrak;

public class kerucut {
    int jari2;
    int sisiMiring;
    
    public kerucut(int r, int sM){
        jari2 = r;
        sisiMiring = sM;
    }

    double luasPermukaan(int r, int sM){
        return Math.PI * r * (sM + r);
    }

    
}
