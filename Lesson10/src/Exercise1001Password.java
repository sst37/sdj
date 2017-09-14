import java.util.Scanner;

public class Exercise1001Password
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      String username = "";
      String password = "";
      String password1 = "";
      
      System.out.print("Please enter your desired username: ");
      username = s.nextLine();
      do {
      System.out.print("Now enter your password: ");
      password = s.nextLine();
      System.out.print("Enter the password again: ");
      password1 = s.nextLine();
      if(!password.equals(password1))
      {
         System.out.println("The passwords didn't match, try again.");
      }
      }
      while(!password.equals(password1));
      s.close();
   }
}
