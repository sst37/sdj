
public class EmployeeTest
{
   public static void main(String[] args)
   {
      Employee person1 = new Employee();
      person1.setName("Susan Meyers");
      person1.setIdNumber(47899);
      person1.setDepartment("Accounting");
      person1.setPosition("Vice President");

      Employee person2 = new Employee();
      person2.setName("Mark Jones");
      person2.setIdNumber(39119);
      person2.setDepartment("IT");
      person2.setPosition("Programmer");
      
      Employee person3 = new Employee();
      person3.setName("Joy Rogers");
      person3.setIdNumber(81774);
      person3.setDepartment("Manufacturing");
      person3.setPosition("Engineer");
      
      System.out.println("Name\t\tID number\tDepartment\tPosition\n_______________________________________________________________"
                +"\n"+person1.getName()+"\t"+person1.getIdNumber()+"\t\t"+person1.getDepartment()+"\t"+person1.getPosition()
                +"\n"+person2.getName()+"\t"+person2.getIdNumber()+"\t\t"+person2.getDepartment()+"\t\t"+person2.getPosition()
                +"\n"+person3.getName()+"\t"+person3.getIdNumber()+"\t\t"+person3.getDepartment()+"\t"+person3.getPosition());
   }
}
