import java.util.*;
class concatenate
{
  public static void main(String args[])
  {
    System.out.println("enter a string");
    Scanner s=new Scanner(System.in);
    String str=s.next();
    System.out.println("enter no of times");
    int n=s.nextInt();
    for(int i=0;i<n;i++)
    {
      str+=str;
    }
    System.out.println("after combining by given no of times: " + str);
  }
}