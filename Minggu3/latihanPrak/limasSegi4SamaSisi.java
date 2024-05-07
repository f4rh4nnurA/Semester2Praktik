package latihanPrak;

public class limasSegi4SamaSisi {
    double pjgSisiAlas;
    double tinggiLimas;

    limasSegi4SamaSisi(double p, double t){
        pjgSisiAlas = p;
        tinggiLimas = t;
    }

    double luasPermukaan(double p, double t){
        return Math.pow(p, 2) + 4 * 1/2 * p * t;
    }

    double volume (double p,double t){ 
        return 1/3 * Math.pow(p, 2) * t;
    }
}
