import java.util.Scanner;

public class Exercise604c
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int no1 = input.nextInt();
      System.out.print("Enter the second number: ");
      int no2 = input.nextInt();
      System.out.print("Enter the third number: ");
      int no3 = input.nextInt();

      if (no1 < no2 && no1 < no3)
      {
         if (no2 < no3)
         {
            System.out.print("Smallest to biggest =\n" + no1 + "\n" + no2 + "\n" + no3);
         }
         else
         {
            System.out.print("Smallest to biggest =\n" + no1 + "\n" + no3 + "\n" + no2);
         }
      }
      else if (no2 < no1 && no2 < no3)
      {
         if (no1 < no3)
         {
            System.out.print("Smallest to biggest =\n" + no2 + "\n" + no1 + "\n" + no3);
         }
         else
         {
            System.out.print("Smallest to biggest =\n" + no2 + "\n" + no3 + "\n" + no1);
         }
      }
      else if (no3 < no1 && no3 < no2)
      {
         if (no1 < no2)
         {
            System.out.print("Smallest to biggest =\n" + no3 + "\n" + no1 + "\n" + no2);
         }
         else
         {
            System.out.print("Smallest to biggest =\n" + no3 + "\n" + no2 + "\n" + no1);
         }
      }
      input.close();
   }
}
