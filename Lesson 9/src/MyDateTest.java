import java.util.Scanner;

public class MyDateTest
{
public static void main(String[] args)
{
   Scanner s = new Scanner(System.in);
   MyDate test1 = new MyDate(1582);
   int Amount = 0;
   System.out.print("Please enter the starting year: ");
  int startyear = (s.nextInt());
  test1.setYear(startyear);
  System.out.print("Please enter the end year: ");
  int endyear = s.nextInt();
  
   for(int i = test1.getYear(); i <= endyear; i++)
   {
      test1.setYear(i);
     
      if(test1.isLeapYear()) {
         Amount++;
      }
   }
   
   
   /*
   for(; test1.getYear() <= 2017; test1.setYear(test1.getYear()+1))
   {
      
      test1.isLeapYear();
      if(test1.isLeapYear()) {
         Amount +=1;
      }
   }
   */
   System.out.println("There has been "+Amount+" leap years since "+startyear);
   MyDate test2 = new MyDate(10, 10, 1995);
   MyDate today = new MyDate(13, 9, 2017);
   System.out.print("\n\nNow please enter your date of birth: \nDay: ");
   test2.setDay(s.nextInt());
   System.out.print("Month: ");
   test2.setMonth(s.nextInt());
   System.out.print("Year: ");
   test2.setYear(s.nextInt());
   int days = 0;
  while(test2.getDay()!=today.getDay() || test2.getMonth() != today.getMonth() || test2.getYear() != today.getYear())
  {
     test2.nextDay();
     days++;
  }
  System.out.println("You are "+days+" days old");
 
  
   //System.out.println("\nYou have been alive for "+test2.nextDay());
}
}
