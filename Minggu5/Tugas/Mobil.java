package Minggu5.Tugas;

public class Mobil {
    int acceleration[];
    String names[];
    int max;
    int min;
    String name;
    Mobil(int Mspeed [], String name[]){
        this.acceleration = Mspeed;
        this.names = name; 
        this.max = max;
        this.min = min;
    } 

    Mobil findMaxWithBF(int acceleration[], String names[]) {
        max = acceleration[0];
        for (int i = 1; i < acceleration.length; i++) {
            if (acceleration[i] > max) {
                max = acceleration[i];
                name = names[i];
            }
        }
        return new Mobil(acceleration, names);
    }

    Mobil findMaxWithDC(int acceleration[], S){
        
    }
}