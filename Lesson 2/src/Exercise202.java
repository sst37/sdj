import java.util.Scanner;

public class Exercise202
{
public static void main(String[] args)
{
   Scanner s = new Scanner(System.in);
   System.out.print("The following program can add three integers together.\nEnter the first number: ");
   int no1 = 0;
   int no2 = 0;
   int no3 = 0;
   no1 = s.nextInt();
   System.out.print("Enter the second number: ");
   no2 = s.nextInt();
   System.out.print("Enter the third number: ");
   no3 = s.nextInt();
   int result = (no1+no2+no3);
   System.out.print("The result of adding the three numbers together is: "+(result));
   s.close();
}
}
