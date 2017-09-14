import java.util.Scanner;

public class Exercise704
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter your desired username: ");
      String username = input.nextLine();
      System.out.print("Please enter a strong password(Not case sensitive): ");
      String password = input.nextLine();
      System.out.print("Confirm your password by entering it again: ");
      String passwordConfirm = input.nextLine();
      
      
      if(password.equalsIgnoreCase(passwordConfirm))
      {
         System.out.println("Your information:\nUsername: "+username+"\nPassword: ******\n\nYour password matched");
      }
      else
      {
         System.out.println("\nPlease try again, the passwords didn't match");
      }
      input.close();
   }
}
