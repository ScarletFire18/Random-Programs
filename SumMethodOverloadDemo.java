public class SumMethodOverloadDemo
{
    public static void main(String[] args)
    {
        SumOverloadMethod obj = new SumOverloadMethod();
        obj.add(5, 2);
        obj.add(4,3,5);
        obj.add(4.5, 3.8);
    }
}