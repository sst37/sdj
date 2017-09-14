
public class personMain
{
   public static void main(String[] args)
   {
      Person test = new Person();
      test.setName("Simon");
      test.setBirthday("28.07.1992");
      System.out.println("Name: " + test.getName());
      System.out.println("Birthday: " + test.getBirthday());
      
      Person test2 = new Person();
      test2.setName("Simon1");
      test2.setBirthday("20.12.2020");
      System.out.println("\nName2: " + test2.getName());
      System.out.println("Birthday2: " + test2.getBirthday());
   }
}
