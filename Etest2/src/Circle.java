public class Circle implements GeometricObject{
     double radius ;
    public Circle (double radius )
    {
        super();
        this.radius = radius;
    }
    @Override
    public double getParameter() {
        return Math.PI*(2*radius);
    }
    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
