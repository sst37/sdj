import java.util.Scanner;

public class Exercise601
{
   public static void main(String[] args)
   {
      Scanner age = new Scanner(System.in);
      System.out.print("Please enter your age here: ");
      int age1 = age.nextInt();

      if (age1 >= 65)
      {
         System.out.println("You are a Senior citizen");
      }
      else if (age1 >= 20)
      {
         System.out.println("You are an Adult");
      }
      else if (age1 >= 13)
      {
         System.out.println("You are a Teenager");
      }
      else if (age1 >= 0)
      {
         System.out.println("You are a Child");
      }
      else
      {
         System.out.println("You just tried to enter something extremely foolish.");
      }
      age.close();
   }
}
