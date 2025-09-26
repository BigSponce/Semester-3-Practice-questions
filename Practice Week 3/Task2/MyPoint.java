package Task2;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint (int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return("(" + x + "," + y + ")");
    }

    public double distance(int x, int y) {
        int differenceX = this.x - x;
        int differenceY = this.y - y;
        return Math.sqrt(differenceX * differenceX + differenceY * differenceY);
    }

    public double distance(MyPoint another) {
        int differenceX = this.x - another.x;
        int differenceY = this.y - another.y;
        return Math.sqrt(differenceX * differenceX + differenceY * differenceY);
    }

    public double distance() {
        int differenceX = this.x;
        int differenceY = this.y;
        return Math.sqrt(differenceX * differenceX + differenceY * differenceY);
    }
}
