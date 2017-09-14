
public class ClockTest
{
public static void main(String[] args)
{
   Clock test = new Clock(11, 45, 58);
   
   System.out.println(test);
   test.tic();
   test.tic();
   System.out.println(test);
   
   
   System.out.println(test.timeInSeconds(test));
   Clock test2 = new Clock(5050);
   
   System.out.println(test2);
   System.out.println(test2.timeInSeconds(test));
   Clock test3 = test2.timeTo(test);
   
   System.out.println(test3);
}
}
