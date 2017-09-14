import java.util.Scanner;
import java.util.Random;

public class Exercise801
{
   public static void main(String[] args)
   {
      Random ran = new Random();
      Scanner s = new Scanner(System.in);
      System.out.print(
            "A random number between 1 and 10 has been created, try and guess\nEnter here: ");
      int guess = s.nextInt();
      int random1 = ran.nextInt(11);
      if (guess == random1)
      {
         System.out.println("Congratulations, you are correct");
      }
      else
         System.out.println("You not lucky :-(");
   }
}
