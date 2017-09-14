
public class Exercise904
{
   public static void main(String[] args)
   
   {
      int no0 = 0;
      int no1 = 1;
      for(int i = 0; i<=20; i++)
      { 
         
         System.out.println("Fibonacci("+i+") = "+(no1));
         int temp = no0;
         no0=no1;
         no1=temp+no1;
        
      }
 
   }
}

/*0 1
1 1
1 2
2 3
3 5
5 8*/