
public class ThePayroll
{
   private String name;
   private double payrate;
   private double hours;

   public void setName(String na)
   {
      name = na;
   }

   public void setPayrate(double pr)
   {
      payrate = pr;
   }

   public void setHours(double hr)
   {
      hours = hr;
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
}
