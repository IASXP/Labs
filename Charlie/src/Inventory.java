public class Inventory {
    private Item item1;
    private Item item2;
    private Item item3;

    public Inventory() {
        item1 = null;
        item2 = null;
        item3 = null;
    }

    public Inventory(Item a, Item b, Item c) {
        item1 = a;
        item2 = b;
        item3 = c;
    }

    public double netWorth() {
        double netWorth = 0;
        if (item1 != null) {
            netWorth += item1.getCost();
        }
        if (item2 != null) {
            netWorth += item2.getCost();
        }
        if (item3 != null) {
            netWorth += item3.getCost();
        }
        return netWorth;
    }

    public boolean roomForNewItem() {
        return (item1 == null || item2 == null || item3 == null);
    }

    public void setItemAsSold(int itemNumber) {
        if (itemNumber == 1) {
            item1 = null;
        }
        else if (itemNumber == 2) {
            item2 = null;
        }
        else if (itemNumber == 3) {
            item3 = null;
        }
    }

    public void setNewItem(Item newItem, int itemNumber) {
        if (itemNumber == 1 && item1 == null) {
            item1 = newItem;
        }
        else if (itemNumber == 2 && item2 == null) {
            item2 = newItem;
        }
        else if (itemNumber == 3 && item3 == null) {
            item3 = newItem;
        }
        else {
            System.out.println("Can't add item to that itemNumber. Currently occupied.");
        }
    }

    public String toString() {
        String str = "";
        if (item1 != null) {
            str += item1.toString() + "\n";
        }
        else {
            str += "NO ITEM\n";
        }
        if (item2 != null) {
            str += item2.toString() + "\n";
        }
        else {
            str += "NO ITEM\n";
        }
        if (item3 != null) {
            str += item3.toString() + "\n";
        }
        else {
            str += "NO ITEM\n";
        }
        return str;
    }
}