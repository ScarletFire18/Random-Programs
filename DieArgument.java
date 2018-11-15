/**
   This program rolls a 6-sided die and
   a 20-sided die.
*/

public class DieArgument
{
   public static void main(String[] args)
   {
      final int SIX_SIDES = 6;
      final int TWENTY_SIDES = 20;
      
      // Create a 6-sided die object.
      Die sixDie = new Die(SIX_SIDES);
      
      // Create a 20-sided die object.
      Die twentyDie = new Die(TWENTY_SIDES);
      

      // Roll the dice.
      rollDie(sixDie);   //passes object sixDie into method as an argument
      rollDie(twentyDie);  //passes object twentyDie into method as an argument
      
   }
   
   /**
      This method simulates a die roll, displaying
      the die's number of sides and value.
      @param d The Die object to roll.
   */
   
   public static void rollDie(Die d)
   {
      // Display the number of sides.
      System.out.println("Rolling a " + d.getSides() + 
                         " sided die.");
      
      // Roll the die.
      d.roll();
      
      // Display the die's value.
      System.out.println("The die's value: " + d.getValue());
   }
}