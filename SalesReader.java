import java.io.*;
import java.util.Scanner;

/**
   The WeeklySalesReader class reads test scores as
   tokens from a file and calculates the average
   of each line of scores.
*/

public class SalesReader
{
   private Scanner inputFile;
   private String line;

   /**
      The constructor opens a file to read
      the grades from.
      @param filename The file to open.
   */
   
   public SalesReader(String filename)
                        throws FileNotFoundException
   {
      File file = new File(filename);
      inputFile = new Scanner(file);
   }
   
   /**
      The readNextLine method reads the next line
      from the file.
      @return true if the line was read, false
      otherwise.
   */

   public boolean readNextLine() throws IOException
   {
      boolean lineRead; // Flag variable
    
      // Determine whether there is more to read.
      lineRead = inputFile.hasNext();

      // If so, read the next line. 
      if (lineRead)
        line = inputFile.nextLine();
       
      return lineRead;
      
   }

   /**
      The getAverage method calculates the average
      of the last set of test scores read from the file.
      @return The average.
   */
    
   public double getAverage()
   {
      double total = 0;    // Accumulator
      double average;   // The average test score

      // Tokenize the last line read from the file.
      String[] tokens = line.split(",");
    
      // Calculate the total of the test scores.
      for (String str : tokens)
      {
         total += Double.parseDouble(str);
      }
    
      // Calculate the average of the scores.
      // Use a cast to avoid integer division.
      average = Math.round(((double) total / tokens.length) * 100) / 100d;
  
      // Return the average.
      return average;
   }   
   
   
      /**
      The getWeeklySum method calculates the sum
      of the last set of test scores read from the file.
      @return The sum.
   */
   public double getWeeklySum()
   {
      double sum = 0;    // Accumulator

      // Tokenize the last line read from the file.
      String[] tokens = line.split(",");
    
      // Calculate the total of the test scores.
      for (String str : tokens)
      {
         sum += Math.round((Double.parseDouble(str)) * 100) / 100d;
      }
      sum = Math.round((sum) * 100) / 100d;
      // Return the sum.
      return sum;
   }


   /**
      The close method closes the file.
   */
   
   public void close() throws IOException
   {
      inputFile.close();
   }
}