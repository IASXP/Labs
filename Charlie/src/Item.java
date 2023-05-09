public class Item {
    private String description;
    private double cost;
    private String dateListed;

    /** Constructor */

    public Item(String d, double c, String date) {
        description = d;
        cost = c;
        dateListed = date;
    }

    /** Getters */

    public double getCost() {
        return cost;
    }




    public String toString() {
        return description + ", $" + cost + "\t(Listed: " + dateListed + ")";
    }
}