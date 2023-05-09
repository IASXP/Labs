public class Cat
{
    private String name;
    private String breed;

    public Cat(String n, String b)
    {
        name = n;
        breed = b;
    }

    public void meow()
    {
        System.out.println(name + ": meooooow");
    }

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }



}
