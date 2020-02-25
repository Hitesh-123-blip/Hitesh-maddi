import java.util.Scanner;
import java.lang.*;
class quad_equ
{
 public static void main(String args[])
  {
    int a,b,c;
    Scanner s=new Scanner(System.in);
    System.out.println("enter a,b,c values");
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    int t=(b*b)-4*a*c;
    double r1,r2;
    if(t<0)
      {
      System.out.println("for this equation there are no real solutions");
      }
      else
      {
      r1=(-b+Math.sqrt(t))/(2*a);
      r2=(-b-Math.sqrt(t))/(2*a);
      System.out.println(r1 + r2 + "are the roots of given equation");
      } 
  }
}