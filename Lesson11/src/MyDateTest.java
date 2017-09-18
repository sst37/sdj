
public class MyDateTest
{
public static void main(String[] args)
{
   MyDate test1 = new MyDate(28,7,1992);
   
   System.out.println(test1.toString());
   
   MyDate test2 = test1.copy();
   
   System.out.println(test2.toString());
   
   MyDate test3 = new MyDate(test1);
   
   System.out.println(test3.toString());
   
   test3.nextDays(365);
   
   System.out.println(test3);
   
   MyDate test4 = new MyDate();
   
   System.out.println(test4);
   
   MyDate test10 = new MyDate(10,9,2017);
   MyDate test11 = new MyDate(5,9,2017);
   
   System.out.println(test10.isBefore(test11));
   
}
}
