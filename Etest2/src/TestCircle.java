public class TestCircle {
    public static void main(String[]args){
        Circle circleOne = new Circle(100);
        ResizableCircle circleTwo = new ResizableCircle(100);
        circleTwo.resize(10);

        System.out.println("What is the area and parameter of the circle ?");
        System.out.printf("The parameter of the circle is %.2f" , circleOne.getParameter());
        System.out.printf("\nThe area of the circle is %.2f " , circleOne.getArea());
        System.out.printf("\nThe new Circle is %.2f  " ,circleTwo.getParameter());
        System.out.printf("\nThe new Circle is %.1f " , circleTwo.getArea());
    }
}
