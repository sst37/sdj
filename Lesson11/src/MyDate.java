import java.util.GregorianCalendar;
public class MyDate
{
   private int day;
   private int month;
   private int year;

   public MyDate(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }
   
   public MyDate()
   {
      MyDate t = today();
      day = t.day;
      month = t.month;
      year = t.year;
   }

   public MyDate(int year)
   {
      this.year = year;
      this.day = 0;
      this.month = 0;
   }

   public void setDay(int day)
   {
      this.day = day;
   }

   public void setMonth(int month)
   {
      this.month = month;
   }

   public void setYear(int year)
   {
      this.year = year;
   }

   public int getDay()
   {
      return day;
   }

   public int getMonth()
   {
      return month;
   }

   public int getYear()
   {
      return year;
   }

   public String getMonthName()
   {
      switch(month)
      {
         case 1:
            return "January";
         case 2:
            return "February";
         case 3:
            return "March";
         case 4:
            return "April";
         case 5:
            return "May";
         case 6:
            return "June";
         case 7:
            return "July";
         case 8:
            return "August";
         case 9:
            return "September";
         case 10:
            return "November";
         case 11:
            return "December";
            default:
               return "Not a valid input";
      }
   }

   public boolean isLeapYear()
   {
      if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
         return true;
      else
         return false;
   }

   public int daysInMonth()
   {
      if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
            || month == 10 || month == 12)
      {
         return 31;
      }
      else if (month == 2)
      {
         if (isLeapYear())
         {
            return 29;
         }
         else
         {
            return 28;
         }
      }
      else if (month > 12 || month < 1)
      {
         return -1;
      }
      else
      {
         return 30;
      }
   }

   public String getAstroSign()
   {
      if (month == 3 && day >= 21 || month == 4 && day <= 19)
      {
         return "Aries";
      }
      else if (month == 4 && day >= 20 || month == 5 && day <= 20)
      {
         return "Taurus";
      }
      else if (month == 5 && day >= 21 || month == 6 && day <= 20)
      {
         return "Gemini";
      }
      else if (month == 6 && day >= 21 || month == 7 && day <= 22)
      {
         return "Cancer";
      }
      else if (month == 7 && day >= 23 || month == 8 && day <= 22)
      {
         return "Leo";
      }
      else if (month == 8 && day >= 23 || month == 9 && day <= 22)
      {
         return "Virgo";
      }
      else if (month == 10 && day >= 23 || month == 11 && day <= 21)
      {
         return "Scorpio";
      }
      else if (month == 11 && day >= 22 || month == 12 && day <= 21)
      {
         return "Sagittarius";
      }
      else if (month == 12 && day >= 22 || month == 1 && day <= 19)
      {
         return "Capricorn";
      }
      else if (month == 1 && day >= 20 || month == 2 && day <= 18)
      {
         return "Aquarius";
      }
      else if (month == 2 && day >= 19 || month == 3 && day <= 20)
      {
         return "Pisces";
      }
      else
      {
         return "Your birthday is not possible... Fool";
      }
   }

   public String dayOfWeek()
   {
      int q = day;
      int m = month;
      int y = year;

      if (month == 1)
      {
         m = 13;
         y = year - 1;
      }
      else if (month == 2)
      {
         m = 14;
         y = year - 1;
      }
      int h = (q + (13 * (m + 1) / 5) + (y % 100) + ((y % 100) / 4)
            + ((y / 100) / 4) + (5 * (y / 100))) % 7;

      if (h == 0)
      {
         return "Saturday";
      }
      else if (h == 1)
      {
         return "Sunday";
      }
      else if (h == 2)
      {
         return "Monday";
      }
      else if (h == 3)
      {
         return "Tuesday";
      }
      else if (h == 4)
      {
         return "Wednesday";
      }
      else if (h == 5)
      {
         return "Thursday";
      }
      else if (h == 6)
      {
         return "Friday";
      }
      else
      {
         return "Something went wrong";
      }

   }

   public void nextDay()
   {
      if (this.day + 1 > daysInMonth())
      {
         if (this.month + 1 > 12)
         {
            year++;
            month = 1;
            day = 1;
         }
         else
         {
            month++;
            day = 1;
         }

      }
      else
      {
         day++;
      }
   }
public boolean equals(MyDate object)
{
   if(day == object.day && month == object.month && year == object.year)
   {
      return true;
   }
   else return false;
}
public MyDate copy()
{
   return new MyDate(day, month, year);
}
public MyDate(MyDate object)
{
   day = object.day;
   month = object.month;
   year = object.year;
}
public void nextDays(int days)
{
  for(int k = 0; k<days;k++)
  {
     nextDay();
  }
}
public static MyDate today()
{
   GregorianCalendar currentDate = new GregorianCalendar();
   return new MyDate(currentDate.get(GregorianCalendar.DATE),currentDate.get(GregorianCalendar.MONTH)+1,currentDate.get(GregorianCalendar.YEAR));
}
public boolean isBefore(MyDate test)
{
   if(year<test.year)
   {
      return true;
   }
   else if(year>test.year)
   {
      return false;
   }
   else
   {
      if(month<test.month)
      {
         return true;
      }
      else if(month>test.month)
      {
         return false;
      }
      else
      {
         if(day<test.day)
         {
            return true;
         }
         else return false;
      }
   }
}
   public String toString()
   {
      return day + "/" + month + "/" + year + "\n\nThis date is a "
            + dayOfWeek();
   }
}
