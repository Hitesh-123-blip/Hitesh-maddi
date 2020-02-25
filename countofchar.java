import java.util.*;
class countofchar
{
  public static void main(String args[])
  {
    System.out.println("enter a string");
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    System.out.println("enter a character for counting the no of occurences in a given string");
    char c=s.next().charAt(0);
    int count=0;
    for(int i=0;i<str.length();i++)
    {
      if(str.charAt(i)==c)
      {
        count+=1;
      }
    }
    System.out.println("occurence of given char in a given string is: " + count + "times");
  }
}