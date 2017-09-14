import java.util.Scanner;

public class Exercise603
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter your Danish grade here: ");
      int grade = input.nextInt();
 
      if (grade == 12)
      {
         System.out.println("That would be an A");
      }
      else if (grade == 10)
      {
         System.out.println("That would be a B");
      }
      else if (grade == 7)
      {
         System.out.println("That would be a C");
      }
      else if (grade == 4)
      {
         System.out.println("That would be a D");
      }
      else if (grade == 2)
      {
         System.out.println("That would be an E");
      }
      else if (grade == 0)
      {
         System.out.println("That would be a Fx");
      }
      else if (grade == -3)
      {
         System.out.println("That would be an F");
      }
      else if (! input.hasNextInt())
      {
         System.out.println("You entered something extremely foolish.");
      }
      input.close();
   }
}
