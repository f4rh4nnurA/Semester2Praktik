package latihanPrak;

public class bola {
    double jari2;

    bola(double r){
        jari2 = r;
    }

    double luasPermukaan (double r){
        return 4 * Math.PI * Math.pow(r, 2);
    }

    double volume (double r){
        return 4/3 * Math.PI * Math.pow(r, 3);
    }
    
}
