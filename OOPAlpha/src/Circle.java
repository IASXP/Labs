public class Circle {
    private double radius;

    public Circle(double rad) {
        radius = rad;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void setRadius(double r) {
        radius = r;
    }
}
