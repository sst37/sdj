import java.util.Scanner;

public class PayrollTest
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      ThePayroll test1 = new ThePayroll();
      
      System.out.print("This program will help you calculate your gross pay, enter information below\nYour name: ");
      test1.setName(s.nextLine());
      System.out.print("Payrate: ");
      test1.setPayrate(s.nextDouble());
      System.out.print("Working hours: ");
      test1.setHours(s.nextDouble());
      
      System.out.println("\n"+test1.getName()+", your gross pay is = "+test1.grossPay());
      s.close();
      
   }
}
