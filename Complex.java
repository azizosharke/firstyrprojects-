public class Complex
{
    final private double x;
    final private double y;
    Complex(double realNum, double imaginaryNum)
    {
        x = realNum;
        y = imaginaryNum;
    }

    public static Complex add(Complex a, Complex b)
    {
        return new Complex(a.x+b.x, a.y+b.y);
    }

    public static Complex multiply(Complex a, Complex b)
    {
        return new Complex((a.x*b.x - a.y*b.y), (a.x*b.y + a.y*b.x));
    }

    public static Complex divide(Complex a, Complex b)
    {
        var v = Math.pow(b.x, 2) + Math.pow(b.y, 2);
        return new Complex(((a.x*b.x + a.y*b.y)/ v),
                (((a.y*b.x) - (a.x*b.y))/ v));
    }

    public String toString()
    {
        return "{" + x + "," + y + "}";
    }
}