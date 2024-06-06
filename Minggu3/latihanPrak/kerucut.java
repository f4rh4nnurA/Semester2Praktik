package latihanPrak;

public class kerucut {
    double jari2;
    double sisiMiring;
    
    public kerucut(double r, double sM){
        jari2 = r;
        sisiMiring = sM;
    }

    double luasPermukaan(){
        return Math.PI * jari2 * (sisiMiring + jari2);
    }

    double volume (){
        double t = Math.sqrt(Math.pow(jari2, 2) + Math.pow(sisiMiring, 2));
        return 1/3 * Math.PI * Math.pow(jari2,2) * t;
    }

}
