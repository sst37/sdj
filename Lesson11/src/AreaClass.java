
public class AreaClass
{
   
   
   
public static double Area(double radius)
{
   return Math.PI*Math.pow(radius, 2);
}
public static double Area(double width, double length)
{
   return width*length;
}
public static double Area(float height, double radius)
{
   
   return Math.PI*Math.pow(radius, 2)*height;
}
}
