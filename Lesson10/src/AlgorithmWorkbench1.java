import java.util.Scanner;

public class AlgorithmWorkbench1
{
   public static void main(String[] args)
   {
      
      // Exercise 1
      System.out.print("Enter a number to multiply: ");
      Scanner s = new Scanner(System.in);
      int input = s.nextInt();
      
      
      // Exercise 2
      do
      {
        int multi = input*=10;
      }
      while(input*10 < 100);
      
      String answer = "";
      
      do {
      System.out.print("Enter the first number: ");
      int in1 = s.nextInt();
      System.out.print("Enter the second number: ");
      int in2 = s.nextInt();
      
      System.out.println("The sum of the two numbers is "+(in1+in2));
      System.out.println("Do you want to do it again? (Yes/No)");
      s.nextLine();
      answer = s.nextLine().toLowerCase();
      
      }
      while(answer.equals("yes"));
      
      // Exercise 3
      
      for(int i = 1; i <= 10; i++)
      {
         System.out.print((5*i)+" ");
      }   
         // Exercise 4
      
         String alphabet = "abcdefghijklmnopqrstuvxyzøæå";
         System.out.println();
         for(int j = 0; j <= 10; j++)
         {
            System.out.print(alphabet.toUpperCase().charAt(j));
         }
       
         // Exercise 5
         
         int b = 30;
         double result = 0;
         for(int k = 1; k <= 30; k++)
         {
            result = +((double)k/(double)b);
            b--;
         }
         System.out.println("\n\nResult: "+result);
      }
}
