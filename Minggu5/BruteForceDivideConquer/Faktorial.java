package Minggu5.BruteForceDivideConquer;

public class Faktorial {
    public int nilai;
    int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 2; i <= n; i++) {
            fakto *= i;
        }
        return fakto;
    }
    int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * faktorialDC(n - 1);
        }
    }
}