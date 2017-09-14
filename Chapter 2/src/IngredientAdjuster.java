import java.util.Scanner;

public class IngredientAdjuster
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in); 
      System.out.print(
            "The following program will help you calculate the amount of ingredients needed.\n\n"
                  + "How many cookies would you like to make? Please enter here: ");
             double sugar = 1.5/48;
             double butter = 1.0/48;
             double flour = 2.75/48;
             double cookies = s.nextDouble();
            System.out.print("\nYou will need the following to produce "+(int)cookies+" cookies\n\n"
                  + "Sugar: "+sugar*cookies+" cups\n"
                        + "Butter: "+butter*cookies+" cups\n"
                              + "Flour: "+flour*cookies+" cups");  
            s.close();
            
   }
}
