public class CircleRunner {
    public static void main(String[] args) {
        Circle circleOne = new Circle(2.0);
        Circle circleTwo = new Circle(3.5);
        System.out.println("Diameter of circle 1 is " + circleOne.getDiameter());
        circleOne.setRadius(6.0);
        System.out.println("Diameter of circle 1 is " + circleOne.getDiameter());
        System.out.println("Area of circle 2 is " + circleTwo.getArea());
    }
}
