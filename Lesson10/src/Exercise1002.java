
public class Exercise1002
{
   public static void main(String[] args)
   {
      double startvalue = 1;
      double count = 0;
      for(int i = 0; i <= 8*8; i++)
      {
         startvalue*=2;
         count+=startvalue;
      }
      System.out.println("The king would have to pay: "+(startvalue+count));
   }
}
