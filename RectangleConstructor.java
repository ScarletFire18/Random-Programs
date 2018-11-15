public class RectangleConstructor
{
    private double length;
    private double width;

    /**
     * Constructor (Initializes parameters automatically, without calling any methods in the Demo (don't need to use setLength, setWidth)
     * @param len The length of the rectangle.
     * @param w The width of the rectangle.
     * CONSTRUCTOR METHODS ALWAYS ARE NAMED THE SAME AS THE CLASS NAME
     * CONSTRUCTOR METHODS DO NOT RETURN A VALUE, SO THERE IS NO NEED TO SPECIFY RETURN TYPE IN HEADER, NOT EVEN VOID TYPE
     */
    public RectangleConstructor(double len, double w)
    {
        length = len;
        width = w;
    }

    /**End of constructor*/

    public double getLength()
    {
        return length;
    }


    /**
     * The getWidth method returns a Rectangle object's width.
     * @return The value in the width field.
     */
    public double getWidth()
    {
        return width;
    }

    /**
     * The getArea method returns a Rectangle object's area.
     * @return The product of length times width.
     */
    public double getArea()
    {
        return length * width;
    }
}

