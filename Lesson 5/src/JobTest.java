
public class JobTest
{
public static void main(String[] args)
{
   Person person1 = new Person("Simon");
   Person person2 = new Person("Allan");
   
   Job simon = new Job("Student", 2000, person1);
   Job allan = new Job("Teacher", 50000, person2);
   
   simon.givePercentageRaise(50);
   allan.givePercentageRaise(-50);
   
   System.out.println(allan+"\n\n"+simon);
  
}
}