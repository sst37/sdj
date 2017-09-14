import java.util.Scanner;

public class Exercise701
{
public static void main(String[] args)
{
   Scanner input = new Scanner(System.in);
   System.out.print("Please enter the number you would like to convert to Roman version: ");
   int no1 = input.nextInt();
   
   if(no1==1)
   {
      System.out.println("That would be I");
   }
   else if(no1==2)
   {
      System.out.println("That would be II");
   }
   else if(no1==3)
   {
      System.out.println("That would be III");
   }
   else if(no1==4)
   {
      System.out.println("That would be IV");
   }
   else if(no1==5)
   {
      System.out.println("That would be V");
   }
   else if(no1==6)
   {
      System.out.println("That would be VI");
   }
   else if(no1==7)
   {
      System.out.println("That would be VII");
   }
   else if(no1==8)
   {
      System.out.println("That would be VIII");
   }
   else if(no1==9)
   {
      System.out.println("That would be IX");
   }
   else if(no1==10)
   {
      System.out.println("That would be X");
   }
   else
   {
      System.out.println("You entered something extremely foolish.");
   }
   input.close();
}
}
