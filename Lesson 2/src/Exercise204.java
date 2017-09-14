import java.util.Scanner;

public class Exercise204
{
   public static void main(String[] args)
   {
      System.out.println("Please enter your personal data below:");
      Scanner s = new Scanner(System.in);
      System.out.print("Name: ");
      String name = s.nextLine();
      System.out.print("Age: ");
      int age = s.nextInt();
      System.out.print("Address: ");
      s.nextLine();
      String address = s.nextLine();
      s.close();
      System.out.println("\nBased on the information given, "
            + "your name is "+name+", you are "+age+" years old "
            +"and you live at "+address);
   }
}
