import java.io.*;  // Needed for IOException

/**
   This program uses the WeeklySalesReader class
   to read sales from a file and get
   their averages.
*/

public class Sales
{
   public static void main(String[] args)
                      throws IOException, FileNotFoundException
{               
      double average;               //Weekly sales average
      double sum;                   //Weekly sales sum
      int salesWeek = 1;            //Control variable
      double totalSum = 0;          //adds weekly sums together
      double weeklyAverage = 0;     //Average sales per week
      int largest = 1;
      double largestSum = 0;        //I tried to instantiate this to week1 total but failed, so I just used zero instead. I know this is not ideal, but works as bandaid.

      int smallest = 1;
      double smallestSum = 999999;  //I tried to instantiate this to week1 total but failed, so I just used a really high number instead. I know this is not ideal, but works as bandaid.
      
      // Create a WeeklySalesReader object.
      SalesReader saleReader =
                  new SalesReader("SalesData.txt");
      
      
      while (saleReader.readNextLine())  //while there is a line of content
      {
         // Get the weekly average and weekly sum from the WeeklySalesReader.
         average = saleReader.getAverage();
         sum = saleReader.getWeeklySum();
         
         //checks if current week sales are greater than last's (or greater than zero if week1). If yes, set to largestSum, and set largest to current week#
         if (sum > largestSum)
            {
               largestSum = sum;
               largest = salesWeek;
            }
            
         //checks if current week sales are less than last's (or less than 999999 if week1). If yes, set to smallestSum, and set smallest to current week#
         if (sum < smallestSum)
            {
               smallestSum = sum;
               smallest = salesWeek;
            }
         
         //Tally Total Sales
         totalSum = totalSum + sum;
         
         // Display the weekly sales average.
         System.out.println("Average for sales for week " +
                            salesWeek + " is $" +
                            average);  
         //Display the weekly sum.
         System.out.println("Total sales for week " +
                            salesWeek + " is $" +
                            Math.round((sum) * 100) / 100d); 
         
         // Increment the sales week.
         salesWeek++;
         
      }
      
      //Calculates average weekly sales
      weeklyAverage = Math.round((totalSum / (salesWeek-1)) * 100) / 100d;
        
      // Print out total sum, weeklyAverage, highest sales week, and lowest sales week. and close the saleReader.
      
      System.out.println("No more sales.\n\nGrand total sales for all weeks is $" + totalSum + "" +
      "\nAverage weekly sales for all weeks is $" + weeklyAverage + ".\nHighest sales week was week " + largest +
      "\nLowest sales week was week " + smallest);
      
      //Close the saleReader
      saleReader.close();
   }
}