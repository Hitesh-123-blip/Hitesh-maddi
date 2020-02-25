import java.util.*;
class sumofdiginstr
{
  public static void main(String args[])
  {
    String str;
    System.out.println("enter the string");
    Scanner s=new Scanner(System.in);
    str=s.next();
    int count=0;
    for(int i=0;i<str.length()-1;i++)
    {
       if(str.charAt(i)=='0'||str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9')
           
    }
    System.out.println("sum of digits is" + count);
  }
}