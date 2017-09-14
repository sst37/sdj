import java.util.Random;
import java.util.Scanner;

public class Exercise906
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      Random no1 = new Random();
      int n = no1.nextInt(1000)+1;
      System.out.print("Please enter your guess(Between 1 and 1000): ");
      //System.out.println("\n"+n);
      int guess = s.nextInt();
      int count = 1;
      
      for(;guess != n; )
      {
         if(guess<n) {
         System.out.print("Incorrect, the number is bigger - try again: ");
         guess = s.nextInt(); 
         count++;
         }
         else {
            System.out.print("Incorrect, the number is smaller - try again: ");
            guess = s.nextInt(); 
            count++;
         }
      }
      System.out.println("You are correct! It took you "+count+" guesses.");
   }
}
