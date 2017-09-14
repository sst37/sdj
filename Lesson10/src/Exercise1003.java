import java.util.Scanner;

public class Exercise1003
{
   public static void main(String[] args)
   {
   Scanner s = new Scanner(System.in);
  // System.out.print("Enter the amount of times you want the program to run: ");
  // int x = s.nextInt();
   int start = 3;
   double part2 = 1;
   /*
      for(int i = 0; i <= x;i++)
      {
         if(i%2==0)
         {
         part2 =part2 -(1.0/start);
        
         }
         else {
            part2 = part2+(1.0/start);
           
         } 
         start+=2;
      }
      */
   
   int i = 0;
   while(Math.abs(4*part2-Math.PI)>0.000001)
   {
      
      if(i%2==0)
      {
      part2 =part2 -(1.0/start);
     
      }
      else {
         part2 = part2+(1.0/start);
        
      } 
      start+=2;
      i++;
      
   }
   System.out.println("Original pi = "+Math.PI+"\nCalculated pi = "+4*part2);
      System.out.println("The calculations ran "+i+" times");
   }
}
