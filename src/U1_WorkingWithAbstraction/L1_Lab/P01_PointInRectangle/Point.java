package U1_WorkingWithAbstraction.L1_Lab.P01_PointInRectangle;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean greaterOrEqual(Point other) {
        return x >= other.x && y >= other.y;
    }

    public boolean lessOrEqual(Point other) {
        return x <= other.x && y <= other.y;
    }
}