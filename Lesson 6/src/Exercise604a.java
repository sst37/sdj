import java.util.Scanner;

public class Exercise604a
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int no1 = input.nextInt();
      System.out.print("\nEnter the second number: ");
      int no2 = input.nextInt();
      
      if (no1 < no2)
      {
         System.out.println("\nThe smallest number entered was: "+no1);
      }
      else 
      {
         System.out.println("\nThe smallest number entered was: "+no2);
      }
      input.close();
   }
}
