import java.util.Scanner; 
public class coba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan NIM Anda: "); 
        int nim = input.nextInt(); 
        int n = nim % 100; 
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
        input.close(); 
    }
}
