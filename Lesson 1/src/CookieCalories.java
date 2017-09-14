
import java.util.Scanner;

public class CookieCalories
{
public static void main(String[] args)
{
   int caloriesPerCookie=300/(40/10);
   Scanner s = new Scanner(System.in);
   int cookiesIn = 0;
   System.out.print("Enter number of cookies consumed: ");
   cookiesIn = s.nextInt();
   int caloriesConsumed=caloriesPerCookie*cookiesIn;
   s.close();
   System.out.println(caloriesConsumed+" Calories consumed");
   if (caloriesConsumed>300) {
      System.out.println("\nCookie monster approves :-)");}
   else System.out.println("\nCookie monster is sad that you don't enjoy more cookies :-(");
}
}
