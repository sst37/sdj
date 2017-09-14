import java.util.Scanner;

public class Exercise606
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter the value for a: ");
      double a = input.nextDouble();
      System.out.print("Please enter the value for b: ");
      double b = input.nextDouble();
      System.out.print("Please enter the value for c: ");
      double c = input.nextDouble();
      double D = ((Math.pow(b, 2))+(-4)*a*c);

      if (D < 0)
      {
         System.out.println("There is no solution to this equation");
      }
      else if (D == 0)
      {
         System.out.println("X = " + (-b / (2 * a)));
      }
      else
      {
         System.out.println("X has two solutions:\nX1 = "+((-b+(Math.sqrt(D)))/(2*a))+"\nX2 = "+((-b-(Math.sqrt(D)))/(2*a)));
      }
      input.close();
   }
}
