import java.util.Scanner;
class ReverseString
{
 public static void main(String args[])
  {
    String str,rev="";
    System.out.println("enter a string");
    Scanner s=new Scanner(System.in);
    str=s.next();
    for(int i=str.length()-1;i>=0;i--)
    {
      rev=rev+str.charAt(i);
    }
   System.out.println("reverse of a string: " + rev);
  }
}