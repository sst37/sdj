package Test;

public class Course
{
private String name;
private int numberOfStudents;
private boolean electiveCourse;

public Course(String name, int numberOfStudents, boolean electiveCourse)
{
   this.name = name;
   this.numberOfStudents = numberOfStudents;
   this.electiveCourse = electiveCourse;
}
public Course(String name, boolean electiveCourse)
{
   this.name = name;
   this.electiveCourse = electiveCourse;
   this.numberOfStudents = 0;
}
public Course()
{
   name = "Test";
   numberOfStudents = 0;
   electiveCourse = false;
}
public void setName(String name)
{
   this.name = name;
}
public void setNumberOfStudents(int numberOfStudents)
{
   this.numberOfStudents = numberOfStudents;
}
public void setElectiveCourse(boolean electiveCourse)
{
   this.electiveCourse = electiveCourse;
}
public String getName()
{
   return name;
}
public int getNumberOfStudents()
{
   return numberOfStudents;
}
public boolean getElectiveCourse()
{
   return electiveCourse;
}
public String toString()
{
   return "Name: "+name+"\nNumber of students: "+numberOfStudents+"\nElective course: "+electiveCourse+"\n";
}
}
