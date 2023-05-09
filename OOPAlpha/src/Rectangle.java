import org.w3c.dom.css.Rect;

public class Rectangle {

    private int length, width;

    /**constructors**/
    public Rectangle()
    {
        length = 15;
        width = 3;
    }

    public Rectangle(int l, int w)
    {
        length = l;
        width = w;
    }

    /**mutator methods**/
    public void setWidth(int w)
    {
        width = w;
    }

    public void setLength(int l)
    {
        length = l;
    }

    public void setDimensions(int l, int w)
    {
        width = w;
        length = l;
    }




    /**accessor methods*/
    public int getLength()
    {
        return length;
    }

    public int getWidth()
    {
        return width;
    }

    public int getArea()
    {
        return length*width;
    }

    public int getPerimeter()
    {
        return 2 * length + 2 * width;
    }



    public void drawRectangle()
    {
        for (int i = 0; i < width; i++)
        {
            for (int j = 0; j < length; j++)
                System.out.print("*");
            System.out.println();
        }
    }


}
