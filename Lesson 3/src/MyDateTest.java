
public class MyDateTest
{
   public static void main(String[] args)
   {
      MyDate test1 = new MyDate();
      test1.setDay(28);
      test1.setMonth(7);
      test1.setYear(1992);
      System.out.println("Result of test1 input is: "
                          +test1.displayDate());
      
      MyDate test2 = new MyDate();
      test2.setDay(12);
      test2.setMonth(8);
      test2.setYear(1959);
      System.out.println("\nResult of test2 input is "
                          +test2.displayDate());
      
   }
}
