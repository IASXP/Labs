import java.util.*;

public class PracticeProblems {
    public static void main(String[] args) {
        System.out.println(5 + " is Odd? >>> " + isOdd(5));
        System.out.println(6 + " is Odd? >>> " + isOdd(6) + "\n");
        System.out.println(15 + " is a single digit? >>> " + isSingleDigit(15));
        System.out.println(-7 + " is a single digit? >>> " + isSingleDigit(-7) + "\n");
        System.out.println("Max between 100 and 200? >>> " + getMax(100, 200));
        System.out.println("Max between -3 and 4? >>> " + getMax(-3, 4)  +"\n");
        System.out.println("Random Roll >>> " + rollDice());
        System.out.println("Random Roll >>> " + rollDice() + "\n");
        System.out.println("Random Roll (20 faces) >>> " + rollDice(20));
        System.out.println("Random Roll  (1000 faces) >>> " + rollDice(1000) + "\n");
        System.out.println("Caps fixing frEd >>> " + capitalizeOnlyFirst("frEd"));
        System.out.println("Caps fixing sAlSA >>> " + capitalizeOnlyFirst("sAlSA") + "\n");
        System.out.println("Area of circle with radius 1.0? >>> " + circleArea(1.0));
        System.out.println("Area of circle with radius 8.5? >>> " + circleArea(8.5) + "\n");

        System.out.println("35 is a multiple of 5? >>> " + isMultiple(5, 35));
        System.out.println("31 is a multiple of 3? >>> " + isMultiple(3, 31) + "\n");

        System.out.println("5 is prime? >>> " + isPrime(5));
        System.out.println("33 is prime? >>> " + isPrime(33));
        System.out.println("2 is prime? >>> " + isPrime(2));
        System.out.println("301 is prime? >>> " + isPrime(301));
        System.out.println("307 is prime? >>> " + isPrime(307) + "\n");
        System.out.println("Printing fred as diagonal");
        printDiagonal("fred");
        System.out.println("Printing salsa as diagonal");
        printDiagonal("salsa");
    }

    // Returns true if the value of the parameter is odd
    public static boolean isOdd(int a) {
        return a % 2 != 0;
    }

    // Returns true if the int parameter is only 1 digit
    public static boolean isSingleDigit(int a) {
        return a >= -9 && a <= 9;
    }

    // Returns the larger of the two numbers
    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Returns a random number between 1 and 6
    public static int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    // Returns a random number between 1 and numFaces
    public static int rollDice(int numFaces) {
        Random rand = new Random();
        return rand.nextInt(numFaces) + 1;
    }

    // Returns the supplied String with the first letter capitalized and all other letters lowercase
    public static String capitalizeOnlyFirst(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    // Returns the area of a circle with the supplied radius
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // Returns true if b is a multiple of a
    public static boolean isMultiple(int a, int b) {
        return b % a == 0;
    }

    // Returns true if the supplied parameter is a prime number
    public static boolean isPrime(double num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printDiagonal(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(s.charAt(i));
        }
    }
}

