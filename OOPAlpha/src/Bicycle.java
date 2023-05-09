public class Bicycle {

    private String color;
    private double location;
    private double speed;

    public Bicycle(String c) {
        color = c;
        location = 0;
        speed = 0;
    }

    public void setSpeed(double newSpeed) {
        speed = newSpeed;
    }

    public void increaseSpeed(double deltaSpeed) {
        speed += deltaSpeed;
    }

    public double travelFarther(double hours) {
        double distance = speed * hours;
        location += distance;
        return distance;
    }

    // Accessor methods
    public String getColor() {
        return color;
    }

    public double getLocation() {
        return location;
    }

    public double getSpeed() {
        return speed;
    }

}
