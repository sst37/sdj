import java.util.Scanner;

public class PrimeChecker
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      int n = 0;
      double test = 0;
      boolean isNotPrime = false;
      System.out.print("Enter the number you would like to check: ");
      n = s.nextInt();
      while (n < 0)
      {
         System.out
               .println("You have entered a number lower than 0, try again.");
         System.out.print("Enter the number you would like to check: ");
         n = s.nextInt();
      }
      for(int k = 2; k<n;k++)
      {
         test = n%k;
         if(test == 0)
         {
           isNotPrime = true;
         }
      }  
      if(isNotPrime==true)
      {
         System.out.println("Not prime");
      }
      else System.out.println("Prime");
      s.close();
      //Should have been a for loop that kept k going up until the input value. No time :(
   }
  
}
