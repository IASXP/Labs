import java.util.*;
import static java.lang.System.*;
public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner console = new Scanner(System.in);

        char goAgain;

        do {

        out.print("Type first number >>> ");
        calc.setNumber1(console.nextDouble());

        out.print("Type second number >>> ");
        calc.setNumber2(console.nextDouble());

        calc.displayChoices();
        out.print("Which operation? >>> ");
        calc.setOperation(console.nextInt());

        double answer = calc.getAnswer();
        calc.getProblem();
        out.print(" = " + answer + "\n");

        out.print("\nPerform another calculation? (y/n) >>> ");
        goAgain = console.next().toLowerCase().charAt(0);

        } while (goAgain == 'y');
    }
}
