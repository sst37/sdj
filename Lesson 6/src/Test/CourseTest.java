package Test;

public class CourseTest
{
public static void main(String[] args)
{
   Course test1 = new Course("Simon", 33, true);
   Course test2 = new Course("Allan", false);
   Course test3 = new Course();
   
   test1.setName("Not Simon");
   test1.setNumberOfStudents(35);
   test2.setElectiveCourse(true);
   
   System.out.println(test1);
   System.out.println(test2);
   System.out.println(test3);
}
}
