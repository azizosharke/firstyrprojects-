public class ComplexDemo
{
    public static void main(String[] args)
    {
        Complex number1 = new Complex(3, 8);
        Complex number2 = new Complex(2, -4);

        Complex number3 = Complex.add(number1, number2);
        System.out.println(number3.toString());

        Complex number4 = Complex.multiply(number1, number2);
        System.out.println(number4.toString());

        Complex number5 = Complex.divide(number1, number2);
        System.out.println(number5.toString());
    }
}

