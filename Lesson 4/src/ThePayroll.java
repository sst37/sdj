
public class ThePayroll
{
   private String name;
   private double payrate;
   private double hours;
   private double grossPay;
   
   public ThePayroll(String name, double hours, double payrate)
   {
      this.name = name;
      this.payrate = payrate;
      this.hours = hours;
      grossPay = hours*payrate;
   }
   public void setName(String name)
   {
      this.name = name;
   }

   public void setPayrate(double payrate)
   {
      this.payrate = payrate;
   }

   public void setHours(double hours)
   {
      this.hours = hours;
   }

   public String getName()
   {
      return name;
   }

   public double getPayrate()
   {
      return payrate;
   }

   public double getHours()
   {
      return hours;
   }
   public double grossPay()
   {
      return payrate*hours;
   }
   public String toString()
   {
      return "Name: "+name+"\nHours: "+hours+"\nPayrate: "+payrate+"\n\nGross pay: "+grossPay;
   }
}
