public class Calculator {
    private double num1, num2;
    private int operation;


    /** Constructor */
    public Calculator()
    {
        num1 = num2 = operation = 0;
    }

    /** Mutator Methods */
    public void setNumber1(double n)
    {
        num1 = n;
    }

    public void setNumber2(double n)
    {
        num2 = n;
    }

    public void setOperation(int o)
    {
        operation = o;
    }

    /** Accessor Methods */
    public double getAnswer()
    {
        switch (operation)
        {
            case 1: return num1 + num2;
            case 2: return num1 - num2;
            case 3: return num1 * num2;
            case 4: return num1 / num2;
            case 5: return num1 % num2;
            case 6: return Math.pow(num1, num2);
            default: return 0;

        }
    }

    public void getProblem()
    {
        System.out.print(num1 + " ");
        switch (operation)
        {
            case 1: System.out.print("+"); break;
            case 2: System.out.print("-"); break;
            case 3: System.out.print("*"); break;
            case 4: System.out.print("/"); break;
            case 5: System.out.print("%"); break;
            case 6: System.out.print("^"); break;
            default: break;
        }
        System.out.print(" " + num2);
    }



    public void displayChoices()
    {
        System.out.println("(1) Addition");
        System.out.println("(2) Subtraction");
        System.out.println("(3) Multiplication");
        System.out.println("(4) Division");
        System.out.println("(5) Modulus");
        System.out.println("(6) Exponentiation");
    }








}
