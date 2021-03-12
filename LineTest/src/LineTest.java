public class LineTest {

    public static void main(String[] args) {
        Point thepointA = new Point(3,6);
        Point thepointB = new Point(8,1);
        Line theline = new Line(thepointA,thepointB);
        System.out.print(pointToString(theline.getP1()));
        System.out.print(pointToString(theline.getP2()));


        Line thelineB = new Line(6,8,3,9);
        System.out.print(pointToString(thelineB.getP1()) );
        System.out.print(pointToString(thelineB.getP2()));
        System.out.printf("%.4f " ,thelineB.getSlope());


    }
    public static String pointToString ( Point point) {
        int x = point.getX();
        int y = point.getY();
        System.out.println("(" + x + "," + y + ")");
        return "";
    }

}
