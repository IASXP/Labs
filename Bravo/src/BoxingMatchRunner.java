import java.util.Random;

import static java.lang.System.out;

public class BoxingMatchRunner {

    public static void main(String[] args) {
        Boxer b1 = new Boxer("Fred", 100);
        Boxer b2 = new Boxer("George", 110);

        out.println(b1);
        out.println(b2);
        out.println("FIGHT!!!! \n");

        while (b1.getHealth() > 0 && b2.getHealth() > 0) {
            Random randomGen = new Random();
            if (randomGen.nextBoolean()) {
                b1.punch(b2);
            } else {
                b2.punch(b1);
            }
            out.println(b1 + " ::: " + b2 + "\n");
        }

        // Print match statistics
        out.println("Match Statistics:");
        out.print("Punches Thrown");
        out.print("\t\t\t" + b1.getName() + ": " + b1.getPunchCount());
        out.println("\t\t" + b2.getName() + ": " + b2.getPunchCount());

        out.print("Damage Caused");
        out.print("\t\t\t" + b1.getName() + ": " + b1.getDamageTotal());
        out.println("\t\t" + b2.getName() + ": " + b2.getDamageTotal());

        out.print("Average Punch Damage");
        out.print("\t" + b1.getName() + ": " + String.format("%.1f", b1.getAveragePunchDamage()));
        out.println("\t\t" + b2.getName() + ": " + String.format("%.1f", b2.getAveragePunchDamage()));

        if (b1.getHealth() > 0) {
            out.println("The winner by knockout is.... " + b1.getName());
        } else {
            out.println("The winner by knockout is.... " + b2.getName());
        }
    }
}
