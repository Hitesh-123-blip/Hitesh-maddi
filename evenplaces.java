import java.util.*;
class evenplaces
{
  public static void main(String args[])
  {
    System.out.println("enter a string");
    Scanner s=new Scanner(System.in);
    String str=s.next();
    String even="";
    for(int i=0;i<str.length();i++)
    {
       even+=str.charAt(i);
       i++;
    }
    System.out.println("characters at even positions: " + even);
  }
}