
public class Clock
{
   private int hour;
   private int minute;
   private int second;

   public Clock(int hour, int minute, int second)
   {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
   }
   public Clock(int second)
   {
      this.hour = second/3600;
      this.minute = (second%3600)/60;
      this.second = second%3600%60;
      
   }

   public void setHour(int hour)
   {
      this.hour = hour;
   }

   public void setMinute(int minute)
   {
      this.minute = minute;
   }

   public void setSecond(int second)
   {
      this.second = second;
   }

   public int getMinute()
   {
      return minute;
   }

   public int getHour()
   {
      return hour;
   }

   public int getSecond()
   {
      return second;
   }

   public void tic()
   {
      if (second + 1 > 59)
      {
         if (minute + 1 > 59)
         {
            hour++;
            minute = 0;
            second = 0;
         }
         else
         {
            minute++;
            second = 0;
         }
      }
      else
      {
         second++;
      }

   }

   public int convertToSeconds()
   {
    

      return (hour * 3600) + (minute * 60) + second;
   }

   public boolean isBefore(int hour, int minute, int second)
   {
      if(this.hour < hour || (this.hour == hour && this.minute < minute) || (this.hour == hour && this.minute == minute && this.second < second))
      {
         return true;
      }
      else return false;
   }
   
   public int timeInSeconds(Clock time)
   {
      return Math.abs(convertToSeconds()-time.convertToSeconds());
   }
   
   public Clock timeTo(Clock time)
   {
    int dif = timeInSeconds(time);
    Clock c = new Clock(dif);
    return c;     
   }
   public String toString()
   {
      String str = "";
      if(hour<10)
         {
         str+="0"+hour+":";
         }
      else
      {
         str+=hour+":";
      }
      if(minute<10)
      {
         str+="0"+minute+":";
      }
      else
      {
         str+=minute+":";
      }
      if(second<10)
      {
         str+="0"+second;
      }
      else
      {
         str+=second;
      }
      return str;
   }
}
