import java.util.Scanner;

public class ApartmentTest
{
public static void main(String[] args)
{
   Scanner s = new Scanner(System.in);
   Apartment test = new Apartment(4, 199, "Simon");
   Apartment test2 = new Apartment(6, 250);
   
   if(test.isForRent()==true)
   {
      test.toString();
   }
   else System.out.println("This apartment is rented by: "+test.tenant);
   if(test2.isForRent()==true)
   {
      test2.toString();
   }
   else System.out.println("This apartment is rented by: "+test2.tenant);
   
   test.moveOut();
   test2.moveIn("Allan");
   double r = 0;
   System.out.print("Please enter the rent you would like: ");
   r = s.nextDouble();
   
   while(r<0)
   {
      System.out.print("You entered a negative number, try again: ");
   r = s.nextDouble();
   }
   test2.rent = r;
   System.out.println("\n"+test.toString());
   System.out.println();
   System.out.println(test2.toString());
   s.close();
  }
}
