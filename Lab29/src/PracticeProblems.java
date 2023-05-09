import java.util.Scanner;

public class PracticeProblems {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        //1
        System.out.println("Which of the following will declare and initialize a variable in Java? ");
        System.out.println("1. int 2a = 4; ");
        System.out.println("2. double circle-area = 5.78; ");
        System.out.println("3. string s = hello!; ");
        System.out.println("4. boolean whoa_now = true; ");

        System.out.print("Answer? >>> ");
        int choice = console.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Incorrect");
                break;
            case 2:
                System.out.println("Incorrect");
                break;
            case 3:
                System.out.println("Incorrect");
                break;
            case 4:
                System.out.println("Correct");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        //2
        System.out.println("\nMath time!");
        System.out.print("Enter first number >>> ");
        double num1 = console.nextDouble();
        System.out.print("Enter second number >>> ");
        double num2 = console.nextDouble();

        System.out.print("Operation? (1)+  (2)-  (3)*  (4)/  (5)%  (6)exp  >>> ");
        choice = console.nextInt();
        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            case 5:
                result = num1 % num2;
                break;
            case 6:
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Incorrect");
                break;
        }

        if (choice >= 1 && choice <= 6) {
            System.out.println("The answer is >>> " + result);
        }

        //3
        System.out.print("\nMaking a PB&J sandwich?  Which step are you stuck on? >>> ");
        choice = console.nextInt();
        System.out.println("Here's what you still need to do:");
        switch (choice) {
            case 1:
                System.out.println("1) Get 2 pieces of bread, a jar of peanut butter and a jar of jelly.");


            case 2:
                System.out.println("2) Open both jars.");


            case 3:
                System.out.println("3) Spread peanut butter on 1 piece of bread.");

            case 4:
                System.out.println("4) Spoon jelly onto the other piece of bread.");

            case 5:
                System.out.println("5) Put bread together so that the peanut butter and jelly are touching.");

            case 6:
                System.out.println("6) Give the sandwich to your dog and feast on a much better food. Salsa!");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 5.");

        }
    }
}