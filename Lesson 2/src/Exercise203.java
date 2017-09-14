import java.util.Scanner;

public class Exercise203
{
public static void main(String[] args)
{
   int price1=80;
   int price2=140;
   int price3=230;
   double taxIn=0;
  System.out.print("Please enter the tax % you would like to use: ");
  Scanner s = new Scanner(System.in);
  taxIn = s.nextInt();
  double tax = ((taxIn/100)+1);
  s.close();
   System.out.println(
         "Item 1: "+price1+" + tax = "+(int)(price1*tax)+" kr"+
         "\nItem 2: "+price2+" + tax = "+(int)(price2*tax)+" kr"+
         "\nItem 3: "+price3+" + tax = "+(int)(price3*tax)+" kr"
    );
   
}
}
