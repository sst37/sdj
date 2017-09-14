import java.util.Scanner;

public class Exercise905
{
public static void main(String[] args)
{
   Scanner s = new Scanner(System.in);
   String text1 = "";
   do {
   System.out.print("\nPlease enter the text you would like to reverse: ");
   text1 = s.nextLine();
   int i = 0;
   int x = 1;
   int test = text1.length();
   if(!text1.equals("quit"))
   {
   while(text1.length() > i)
   { 
      System.out.print(text1.charAt(test-x));
      i++;
      x++;
   }
   }
 }
 while(!text1.equals("quit"));
   
}
}