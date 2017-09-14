
public class Job
{
   private String title;
   private double salary;
   private Person employee;

   public Job(String title, double salary, Person name)
   {
      this.title = title;
      this.salary = salary;
      this.employee = name;

   }

   public Job(String title, double salary)
   {
      this.title = title;
      this.salary = salary;
      employee = null;
   }

   public void setTitle(String title)
   {
      title = this.title;
   }

   public void setSalary(double salary)
   {
      salary = this.salary;
   }

   public void setEmployee(Person employee)
   {
      this.employee = employee;
   }

   public String getTitle()
   {
      return title;
   }

   public double getSalary()
   {
      return salary;
   }

   public Person getEmployee()
   {
   return employee;
   }

  public void givePercentageRaise(double salary)
{
   this.salary*=((salary/100)+1);
}
  public String toString()
  {
     return "Name: "+employee.getName()+"\nProfession: "+title+"\n Salary: "+salary;
  }
}
