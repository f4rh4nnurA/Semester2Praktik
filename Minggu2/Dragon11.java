package Minggu2;

public class Dragon11 {
    public static Dragon11 drg;
    int x,y,width,height;

    public Dragon11(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    void moveLeft(){
        if (x < 0 || x > width) {
            detectCollison();
        } else {
            x -= 1;
        }
    } 
    
    void moveRight(){
        if (x < 0 || x > width) {
            detectCollison();
        } else {
            x += 1;
        }
    }

    void moveUp (){
        if (y < 0 || y > height) {
            detectCollison();
        } else {
            y -= 1;
        }
    }

    void moveDown (){
        if (y < 0 || y > height) {
            detectCollison();
        } else {
            y += 1;
        }
    }

    void printPosition (){
        System.out.println("X : " + x + ", " +"Y: " + y );
    }

    void detectCollison(){
        System.out.println("Game over");
        System.exit(0);
    }
}
