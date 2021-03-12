

public class Line {

    private Point p1 ;
    private Point p2;

    public Line(Point p1, Point p2) {
        this. p1 = new Point(p1.getX(), p1.getY());
        this.p2 = new Point(p2.getX(), p2.getY());
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }
    public double getSlope() {
        return  (((double) p2.getY() - (double)p1.getY()) / ((double)p2.getX() - (double)p1.getX()));


    }
    public Line(int x1, int y1 , int x2 , int y2) {
        p1 = new Point(x1, y1);
        p2 =new Point(x2,y2);
    }

}
