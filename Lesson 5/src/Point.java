
public class Point
{
private int x;
private int y;

public Point(int x, int y)
{
   this.x = x;
   this.y = y;
}
public void setPoint(int x, int y)
{
   this.x = x;
   this.y = y;
}
public int getPointX()
{
   return x;
}
public int getPointY()
{
   return y;
}
public void moveTo(int x, int y)
{
   this.x = x;
   this.y = y;
}
public void move(int x, int y)
{
   this.x+=x;
   this.y+=y;
}
public String toString()
{
   return "("+x+", "+y+")";
}
}
