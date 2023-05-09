import java.util.Arrays;

public class PracticeProblems {

    public static void main(String[] args) {
        System.out.println("Grade of 80 is a " + letterGrade(80));
        System.out.println("Grade of 62.3 is a " + letterGrade(62.3));
        System.out.println("Grade of 105 is a " + letterGrade(105) + "\n");

        System.out.println("Printing a size 2 square");
        squareBoard(2);

        System.out.println("Printing a size 3 square");
        squareBoard(3);
        System.out.println();

        System.out.println("Printing a size 3 checkerboard");
        checkerBoard(3);
        System.out.println();

        System.out.println("Here are the first 2 powers of 2");
        printPow2(2);

        System.out.println("Here are the first 3 powers of 2");
        printPow2(3);
        System.out.println();


        System.out.println("Roots using 1.0, 2.0, 1.0: " + Arrays.toString(quad(1.0, 2.0, 1.0)));
        System.out.println("Roots using 1.0, 1.0, -4.0: " + Arrays.toString(quad(1.0, 1.0, -4.0)));
        System.out.println("Roots using 1.0, -2.0, -4.0: " + Arrays.toString(quad(1.0, -2.0, -4.0)));

        System.out.println();

        System.out.println("Converting 24.2 C to F: " + convertTemp(24.2, false));
        System.out.println("Converting 86 F to C: " + convertTemp(86, true));

        System.out.println();

        int array[] = {7, 6, 9, 4, 3, 7, 2};
        System.out.println("My array is "+Arrays.toString(array));
        System.out.println("Searching for 7. Location: " + simpleSearch(array, 7));
        System.out.println("Searching for 3. Location: " + simpleSearch(array, 3));
        System.out.println("Searching for 5. Location: " + simpleSearch(array, 5));

        System.out.println();

        System.out.print("Print 123 in reverse: ");
        printReverse(123);
        System.out.println();

        System.out.print("Print 3674 in reverse: ");
        printReverse(3674);

        System.out.println();
        System.out.println();

        int array1[] = {1, 2, 3};
        int array2[] = {1, 2, 1, 2, 3};
        int array3[] = {1, 2, 3, 4};
        System.out.println("Is " + Arrays.toString(array1) + " found in " +
                Arrays.toString(array2) + "? " +  contains(array2, array1));

        System.out.println("Is " + Arrays.toString(array3) + " found in " +
                Arrays.toString(array2) + "? " +  contains(array2, array3));




    }

    public static String letterGrade(double grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else {
            return "F";
        }
    }

    public static void squareBoard(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void checkerBoard(int size) {
        for (int i = 0; i < size; i++) {


            if (i % 2 == 1)
            {
                System.out.print(" ");
                for (int j = 0; j < size; j++) {
                    System.out.print("# ");
                }
                System.out.println();
            }
            else
            {
                for (int j = 0; j < size; j++) {
                    System.out.print("# ");
                }
                System.out.println();
            }

        }
    }

    public static void printPow2(int n) {
        int powerOf2 = 1;
        for (int i = 0; i < n; i++) {
            System.out.println("2^" + i + " = " + powerOf2);
            powerOf2 *= 2;
        }
    }

    public static double[] quad(double a, double b, double c) {
        double[] roots = new double[2];
        double discriminant = b * b - 4 * a * c;
        if (discriminant >= 0) {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
        }
        return roots;
    }

    public static double convertTemp(double temp, boolean isF) {
        if (isF) {
            return (temp - 32) * 5 / 9;
        } else {
            return temp * 9 / 5 + 32;
        }
    }

    public static int simpleSearch(int[] nums, int value) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                return i;
            }

        }

        return -1;
    }

    public static void printReverse(int n) {
        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit);
            n /= 10;
        }
    }

    public static boolean contains(int[] a, int[] b) {
       for (int f = 0; f <= a.length - b.length; f++)
       {
           boolean matches = true;
           for (int j = 0; j < b.length; j++)
           {
               if (a[f+j] != b[j])
               {
                   matches = false;
                   break;
               }
           }
           if (matches)
           {
               return true;
           }
       }
        return false;
    }



}



