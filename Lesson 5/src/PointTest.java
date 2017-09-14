
public class PointTest
{
public static void main(String[] args)
{
   Point test1 = new Point(2,4);
   Point test2 = new Point(10,50);
   
   
   System.out.println(test1+"\n\n"+test2+"\n\nDistance between the points: "
   +(Math.sqrt((Math.pow(test2.getPointX()-test1.getPointX(), 2))+(Math.pow(test2.getPointY()-test1.getPointY(), 2)))));
}
}
