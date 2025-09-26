package Task2;

public class MyTriangle {
    private MyPoint v1 = new MyPoint(0,0);
    private MyPoint v2 = new MyPoint(0,0);
    private MyPoint v3 = new MyPoint(0,0);

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return "MyTriangle[v1 = " + v1 + ", v2 = " + v2 + ", v3 = " + v3 + "]";
    }

    public double getPerimeter() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
        return side1 + side2 + side3;
    }

    public String getType() { 
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);

        /* This confused me, online it said to use an EPSILON value to have a better difference tolerance
        We had not learned that nor do I entirely understand it,
        so I excluded it for a more precise (potentially incorrect) option. */
        if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side2 == side3) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}

