import java.util.Scanner;

public class Exercise901
{
public static void main(String[] args)
{
   Scanner s = new Scanner(System.in);
   char inputtype;
   String inputty;
   do {
   System.out.print("Choose to make a list, multiply or square (L/M/S): ");
   inputty = s.nextLine().toLowerCase();
   
   inputtype = inputty.charAt(0);
   }while(inputtype != 's' && inputtype != 'm' && inputtype != 'l' || inputty.length() > 1);
   System.out.print("Please enter your desired number: ");
   int inputnum = s.nextInt();
   
   if(inputtype=='l') {
      for(int i = 1; i <= inputnum;i++) {
         System.out.println(i);
      }
   }
      else if(inputtype=='m') {
         for(int i = 1; i <= inputnum;i++) {
            System.out.println(i*inputnum);
         }
      }
      else if(inputtype=='s') {
         for(int i = 1; i <= inputnum;i++) {
            System.out.println(Math.pow(i, 2));
         }
      }
   }
}
