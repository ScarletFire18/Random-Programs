//Examples of classes in the Java API.

/**
 * This program writes random numbers to a file.
 */

import java.util.Scanner;    //Needed for Scanner class
import java.util.Random;     //Needed for the Random class
import java.io.*;             //Needed for the file input/output class


public class ObjectDemo
{
    public static void main(String[] args) throws IOException
    {
        int maxNumbers; //Max number of random objects
        int number;     //To hold a random number

        //Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        //Create a random object to generate random numbers.
        Random rand = new Random();

        //Creates a PrintWriter object to open the file.
        PrintWriter outputFile = new PrintWriter("ObjectDemoNumbers.txt");

        //Get the number of random numbers to write.
        System.out.print("How many random numbers should I write? ");
        maxNumbers = keyboard.nextInt();

        //Write the random numbers to the file.
        for (int count = 0; count < maxNumbers; count++)
        {
            //Generate a random integer, method call.
            number = rand.nextInt();

            //Write the random integer to the file, method call.
            outputFile.println(number);
        }

        //Close the file, method call.
        outputFile.close();
        System.out.println("Done");
    }
}
