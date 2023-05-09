public class Runner {
    public static void main(String[] args)
    {
        Cat c1 = new Cat("Tom", "Alley");
        Cat c2 = new Cat("Sam", "Persian");

        c1.setName("Fred");
        System.out.println(c1.getName());

        c1.meow();
        c2.meow();
    }

}
