public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle("blue");

        bike.setSpeed(10); // set the speed to 10
        System.out.println("Color: " + bike.getColor());
        System.out.println("Speed: " + bike.getSpeed());
        System.out.println("Miles traveled: " + bike.travelFarther(3.0/60));
        System.out.println("Current Location: " + bike.getLocation());

        bike.increaseSpeed(5);
        System.out.println("Speed: " + bike.getSpeed());
        System.out.println("Miles traveled: " + bike.travelFarther(3.0/60));
        System.out.println("Current Location: " + bike.getLocation());
    }
}
