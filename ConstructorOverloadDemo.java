class ConstructorOverloadExample
{
    int num1, num2;
    String operation;

    public ConstructorOverloadExample()
    {
        num1 = 0;
        num2 = 0;
        operation = "Nothing";
    }

    public ConstructorOverloadExample(int i)
    {
        num1 = i;
        num2 = 0;
        operation = "Nothing";
    }

    public ConstructorOverloadExample(int i, int j)
    {
        num1 = i;
        num2 = j;
        operation = "Nothing";
    }

    public ConstructorOverloadExample(int i, int j, String op)
    {
        num1 = i;
        num2 = j;
        operation = op;
    }
}

public class ConstructorOverloadDemo
{
    public static void main(String[] args)
    {
        ConstructorOverloadExample obj = new ConstructorOverloadExample(4,5,"POOPS");
    }
}
