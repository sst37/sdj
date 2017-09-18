
public class Apartment
{
   int numberOfRooms = 0;
   double rent = 0;
   String tenant = "";

   Apartment(int numberOfRooms, double rent, String tenant)
   {
      this.numberOfRooms = numberOfRooms;
      this.rent = rent;
      this.tenant = tenant;
   }

   Apartment(int numberofRooms, double rent)
   {
      this.numberOfRooms = numberofRooms;
      this.rent = rent;
      tenant = "No tenant";
   }

   public int getNumberOfRooms()
   {
      return numberOfRooms;
   }

   public double getRent()
   {
      return rent;
   }

   public String gettenant()
   {
      return tenant;
   }

   public void setRent(double rent)
   {
      this.rent = rent;
   }

   public boolean isForRent()
   {
      if (tenant.equals("No tenant") || tenant.equals(""))
      {
         return true;
      }
      else
         return false;
   }

   public void moveIn(String tenant)
   {
      if (isForRent() == false)
      {
         this.tenant = "Not for rent";
      }
      else this.tenant = tenant;
   }

   public void moveOut()
   {
      tenant = "No tenant";
   }

   public String toString()
   {
      return "Information about this apartment:\nNumber of rooms: "
            + numberOfRooms + "\n Rent: " + rent+"\nTenant: "+tenant;
   }
}
