import java.util.Random;

public class Person {
    private String name;
    private int happiness;

    private Random rand;

    public Person(String name, int happiness) {
        this.name = name;
        this.happiness = happiness;
        rand = new Random();
    }

    public int punchCount ()
    {
        return 1;
    }


    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

    public void actOfKindness(Person other) {
        int amount = rand.nextInt(21) + 10;
        happiness += amount;
        other.happiness += amount;
        System.out.printf("%s hugs %s (+%d happiness)%n", name, other.name, amount);
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", name, happiness);
    }
}
