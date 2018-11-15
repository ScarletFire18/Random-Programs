import java.util.Scanner;

public class CellphoneDemo
{
    public static void main(String[] args)
    {
        String testMan;
        String testMod;
        double testPrice;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the manufacturer: ");
        testMan = keyboard.nextLine();

        System.out.println("Enter the model: ");
        testMod = keyboard.nextLine();

        System.out.println("Enter the price: ");
        testPrice = keyboard.nextDouble();

        Cellphone phone = new Cellphone(testMan, testMod, testPrice);

        System.out.println();
        System.out.println("Here is the data you provided:");
        System.out.println("Manufacturer: " + phone.getManufact());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Price: $" + phone.getRetailPrice());
    }
}
