import java.util.*;

public class Boxer {
    /**
     * Private Instance Variables
     */
    private String name;
    private int health;
    private int punchCount;
    private int damageTotal;

    /**
     * Constructor
     */
    public Boxer(String n, int h) {
        name = n;
        health = h;
        punchCount = 0;
        damageTotal = 0;
    }

    /**
     * Mutators/Modifiers Methods
     */

    public void punch(Boxer other) {
        Random randomGen = new Random();
        int amount = randomGen.nextInt(10) + 1;

        if (amount > 4) //hook
        {
            System.out.print(name + " nails " + other.name + " with a left hook.");
            System.out.print("  Power: " + amount);
        } else if (amount > 8) //jab
        {
            System.out.print(name + " smacks " + other.name + " with a right jab.");
            System.out.print("  Power: " + amount);
        } else //uppercut
        {
            System.out.print(name + " destroys " + other.name + " with an uppercut.");
            System.out.print("  Power: " + amount);
        }

        other.health -= amount;
        punchCount++;
        damageTotal += amount;
    }

    /**
     * Accessor Methods
     */

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getPunchCount() {
        return punchCount;
    }

    public int getDamageTotal() {
        return damageTotal;
    }

    public double getAveragePunchDamage() {
        if (punchCount == 0) {
            return 0.0;
        } else {
            return (double) damageTotal / punchCount;
        }
    }

    @Override
    public String toString() {
        return name + " (Health: " + health + ")";
    }
}