import java.util.Arrays;
import java.util.Random;

public class KindnessRunner {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Person("Fred", 0);
        people[1] = new Person("George", 0);
        people[2] = new Person("Bill", 0);
        people[3] = new Person("Mary", 30);

        Random rand = new Random();
        int day = 1;

        System.out.println("Starting point");
        System.out.println(Arrays.toString(people));
        System.out.println();

        while (!allHappy(people)) {
            System.out.printf("Day %d%n", day);
            for (int i = 0; i < people.length; i++) {
                if (people[i].getHappiness() >= 30) {
                    int j = rand.nextInt(people.length);
                    if (i != j) {
                        people[i].actOfKindness(people[j]);
                    } else {
                        people[i].actOfKindness(people[i]);
                    }
                }
            }
            System.out.println(Arrays.toString(people));
            System.out.println();
            day++;
        }
    }

    private static boolean allHappy(Person[] people) {
        for (Person p : people) {
            if (p.getHappiness() < 50) {
                return false;
            }
        }
        return true;
    }
}
