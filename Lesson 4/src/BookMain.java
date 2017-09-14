import java.util.Scanner;

public class BookMain
{
   public static void main(String[] args)
   {
      Scanner b = new Scanner(System.in);
      System.out.print(
            "Please enter the information about the books\n\n" + "Author: ");
      String author = b.nextLine();
      System.out.print("Title: ");
      String title = b.nextLine();
      System.out.print("Price: ");
      double price = b.nextDouble();
      System.out.print("Pages: ");
      int pages = b.nextInt();
      Book book1 = new Book(author, title, price, pages);

      System.out
            .print("\nDo you want to add another book? (Yes/No)\nEnter here: ");
      b.nextLine();
      String Answer = b.nextLine();
      if (Answer.toLowerCase().equals("yes"))
      {
         System.out.print(
               "\nPlease enter the information about the next book:\n\nAuthor: ");
         String author2 = b.nextLine();
         System.out.print("Title: ");
         String title2 = b.nextLine();
         System.out.print("Price: ");
         double price2 = b.nextDouble();
         System.out.print("Pages: ");
         int pages2 = b.nextInt();

         Book book2 = new Book(author2, title2, price2, pages2);

         System.out.print(
               "\nAre you a member of the library? (20% discount for members, answer Yes/No)\nEnter here: ");
         b.nextLine();
         String Member = b.nextLine();

         if (Member.toLowerCase().equals("yes"))
         {
            book1.setPrice(price * 0.8);
            book2.setPrice(price2 * 0.8);
            System.out.println("\nYou have bought the following book(s):\n"
                  + book1 + "\n\n" + book2);
         }
         else
            System.out.println("\nYou have bought the following book(s):\n"
                  + book1 + "\n\n" + book2);

      }
      else
         System.out.print(
               "\nAre you a member of the library? (20% discount for members, answer Yes/No)\nEnter here: ");
      String Member2 = b.nextLine();

      if (Member2.toLowerCase().equals("yes"))
      {
         book1.setPrice(price * 0.8);
         System.out
               .println("\nYou have bought the following book(s):\n" + book1);
      }
      else
         System.out
               .println("\nYou have bought the following book(s):\n" + book1);
      b.close();
   }
}
