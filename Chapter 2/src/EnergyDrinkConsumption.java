import java.util.Scanner;

public class EnergyDrinkConsumption
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.print("Amount of people surveyed: ");
      double amount = s.nextDouble();
      System.out.print("How many purchase more than one per week in %?: ");
      double manypur = s.nextDouble()/100;
      System.out.print("How many prefer citrus-flavored energy drink in %?: ");
      double taste = s.nextDouble()/100;
      System.out.println("\nBased on the input the following has been calculated."
            + "\n\nThe amount of people buying more than one energy drink per week = "+amount*manypur
            + "\nThe amount of people that prefer citrus-flavored energy drink = "+amount*taste);
      s.close();
      
}     
}
