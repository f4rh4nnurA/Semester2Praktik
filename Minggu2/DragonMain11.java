package Minggu2;

public class DragonMain11 {
    public static void main(String[] args) {
        Dragon11.drg = new Dragon11(5, 5, 10, 10);
        Dragon11.drg.printPosition();
        Dragon11.drg.moveRight();
        Dragon11.drg.moveUp();
        Dragon11.drg.printPosition();

        for (int i = 0; i < 10; i++){
            Dragon11.drg.moveRight();
        }
    }
}
