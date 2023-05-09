import java.util.Scanner;

public class InventoryRunner {


    public static void main(String[] args) {
        Inventory randomShop = new Inventory();

        Scanner console = new Scanner(System.in);

        boolean cont = true;



        do {

            System.out.println("Current inventory:\n" + randomShop.toString());

            System.out.print("(1) Add item to inventory." +
                                 "\n(2) Remove sold item from inventory." +
                                 "\n(3) Get net worth of inventory" +
                                 "\n(4) Quit");

            System.out.print("\nWhat would you like to do? (1-4) >>> "); int temp = console.nextInt();



            String itemName = "";
            double itemCost;
            String dOList = "";
            int location;

            boolean emerbreak = false;

            switch (temp)
            {
                case 1:
                    System.out.print("New item name/description >>> "); console.nextLine();
                    itemName = console.nextLine();
                    System.out.print("New item cost >>> $"); itemCost = console.nextDouble();
                    System.out.print("New item date of listing >>> "); dOList = console.next();
                    System.out.print("Where in the garage will you store this? (1-3) >>> "); location = console.nextInt();
                    System.out.println();



                    Item newItem = new Item(itemName, itemCost, dOList);

                    randomShop.setNewItem(newItem, location);


                    break;
                case 2:
                    System.out.print("Which item did you sell? (1-3) >>> "); location = console.nextInt();
                    System.out.println("Item from spot " + location + " is now gone.");
                    randomShop.setItemAsSold(location);
                    break;
                case 3:
                    System.out.println("Net worth of inventory >>> $" + randomShop.netWorth());
                    break;
                case 4:
                    emerbreak = true;
            }

            if (emerbreak)
            {
                break;
            }

            System.out.println("\nPress enter to continue...\n"); cont = console.hasNextLine();


        } while (cont);


    }


}
