package Test;
import java.util.Scanner;

public class Questions1Test
{
public static void main(String[] args)
{
   Scanner test = new Scanner(System.in);
   System.out.print("Type an integer: ");
  int int1 = test.nextInt();
  System.out.print("Type a second integer: ");
  int int2 = test.nextInt();
  System.out.print("Type a third integer: ");
  int int3 = test.nextInt();
  System.out.println("The product of ("+int1+" * "+int2+") is "+int1*int2);
  System.out.println("The sum of ("+int1+" + "+int2+") is "+(int1+int2));
  System.out.println("The quotient of ("+int2+" / "+int3+") is "+(int2/int3));
  System.out.println("The difference of ("+int2+" - "+int3+") is "+(int2-int3));
   //For the division to be correct, the type should have been double since it will have decimals.
  test.close();
}


}
