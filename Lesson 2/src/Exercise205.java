import java.util.Scanner;

public class Exercise205
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      System.out.print("Please enter the test results below:\nTest 1: ");
      double result1 = s.nextDouble();
      System.out.print("Test 2: ");
      double result2 = s.nextDouble();
      System.out.print("Test 3: ");
      double result3 = s.nextDouble();
      System.out.println("The results are: Test 1: "+(int)result1+" Test 2: "+(int)result2+" Test 3: "+(int)result3
                         +"\nThe average score is: "+(result1+result2+result3)/3);
      s.close();
      
   }
}
