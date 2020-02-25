import java.util.Scanner;
interface area
{
 double pi=3.14;
 //void calarea();
}
class circle implements area
{
  void calarea(int r)
    {
      System.out.println("area of circle: " + pi*r*r);
    }
}
class testcircle
{
  public static void main(String args[])
  {
    int r;
    System.out.println("enter the radius");
    Scanner s=new Scanner(System.in);
    r=s.nextInt();
    circle ca=new circle();
    ca.calarea(6);
  }
}