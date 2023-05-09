public class RectangleRunner {
    public static void main(String[] args) {
        //Construct r1, a default rectangle object.
        Rectangle r1 = new Rectangle();
        //Print the length and width of r1.
        System.out.println("r1 length is " + r1.getLength());
        System.out.println("r1 width is " + r1.getWidth());
        //Print the area of r1.
        System.out.println("r1 area is " + r1.getArea());
        //Change the width of r1 to 2.
        r1.setWidth(2);
        //Change the length of r1 to 8.
        r1.setLength(8);
        //Print the new area of r1.
        System.out.println("r1 new area after changes is " + r1.getArea());

        //Draw r1 with ASCII art (character symbols)
        System.out.println("Here's what r1 looks like:");
        r1.drawRectangle();

        //Construct r2, a new (3 x 3) rectangle object (now you have 2)
        Rectangle r2 = new Rectangle(3, 3);
        //Print the perimeter of r2.
        System.out.println("r2 perimeter is " + r2.getPerimeter());
        //With 1 method call, change r2 into a 4 by 4 rectangle.
        r2.setDimensions(4, 4);
        //Draw r2 with ASCII art (character symbols)
        System.out.println("Here's what r2 looks like:");
        r2.drawRectangle();
        //Draw r1 again, to make sure it hasn't changed any!
        System.out.println("Here's what r1 looks like:");
        r1.drawRectangle();


        Rectangle r3 = new Rectangle(2, 3);
        r2.setDimensions(16, 2);
        r1.setDimensions(8, 3);

        r3.drawRectangle();
        r2.drawRectangle();
        r1.drawRectangle();
        r2.drawRectangle();
        r3.drawRectangle();
    }
}