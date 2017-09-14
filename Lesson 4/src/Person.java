
public class Person
{
   private String name;
   private String birthday;

  
   public Person(String name)
   {
      this.name = name  ;
      birthday = null;
   }
   public Person(String name, String birthday)
   {
      this.name = name;
      this.birthday = birthday;
   }
   public void setName(String name)
   {
      this.name = name;   
   }
   public void setBirthday(String bday)
   {
      birthday = bday;
   }
   public String getName()
   {
      return name;
   }

   public String getBirthday()
   {
      return birthday;
   }
   public String toString()
   {
      return "Name: "+name+"\nBirthday: "+birthday;
   }
   
}
