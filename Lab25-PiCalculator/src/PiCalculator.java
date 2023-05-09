import java.util.*;

public class PiCalculator {
    public static void main(String[] args) {
        System.out.println("Series of 10 >>> " + approximatePi(10));
        System.out.println("Series of 1000 >>> " + approximatePi(1000));
    }
    public static double approximatePi(int precision) {
        double pi = 0.0;
        int sign = 1;
        for (int i = 0; i < precision; i++) {
            pi += sign * (1.0 / (2 * i + 1));
            sign = -sign;
        }
        return pi * 4;
    }
}

