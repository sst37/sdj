import java.util.Scanner;

public class Exercise602
{
   public static void main(String[] args)
   {
      Scanner gender = new Scanner(System.in);
      Scanner age = new Scanner(System.in);
      System.out.print("Please enter your Gender (F or M): ");
      String test1 = gender.nextLine().toUpperCase();
      char gender1 = test1.charAt(0);
      System.out.print("Please enter your age: ");
      int age1 = age.nextInt();

      if (gender1 != 'M' && gender1 != 'F' || age1 < 0)
      {
         System.out.println("You entered something extremely foolish");
      }
      else if (gender1 == 'M')
      {
         if (age1 < 18)
         {
            System.out.println("You are a Boy");
         }
         else
         {
            System.out.println("You are a Man");
         }

      }
      else
      {
         if (age1 < 18)
         {
            System.out.println("You are a Girl");
         }
         else
         {
            System.out.println("You are a Woman");
         }
      }
      gender.close();
      age.close();
   }
}
