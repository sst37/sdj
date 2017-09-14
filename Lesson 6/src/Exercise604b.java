import java.util.Scanner;

public class Exercise604b
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int no1 = input.nextInt();
      System.out.print("\nEnter the second number: ");
      int no2 = input.nextInt();
      
      if(no1 < no2)
      {
         System.out.print("Smallest to biggest =\n"+no1+"\n"+no2);
      }
      else 
      {
         System.out.print("\nSmallest to biggest =\n"+no2+"\n"+no1);
      }
      input.close();
   }
}
