import java.util.Scanner;

public class WaffleIrons {
    public static void main(String[] args) {
        double[] prices = {10.98, 14.50, 19.98, 24.49, 26.87};
        int[] quantities = {0, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter model >>> ");
            int model = scanner.nextInt();
            if (model == -1) {
                break;
            }

            System.out.print("Enter quantity >>> ");
            int quantity = scanner.nextInt();

            switch (model) {
                case 1:
                    quantities[0] += quantity;
                    break;
                case 2:
                    quantities[1] += quantity;
                    break;
                case 3:
                    quantities[2] += quantity;
                    break;
                case 4:
                    quantities[3] += quantity;
                    break;
                case 5:
                    quantities[4] += quantity;
                    break;
                default:
                    System.out.println("Invalid model entered.");
                    break;
            }
        }

        double totalCost = 0;
        for (int i = 0; i < 5; i++) {
            totalCost += prices[i] * quantities[i];
        }

        totalCost = totalCost * 100;
        totalCost = Math.round(totalCost);
        totalCost = totalCost/100;

        System.out.println("Total sales >>> $" + totalCost);
    }
}