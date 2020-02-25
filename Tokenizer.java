import java.util.*;
//import java.util.Scanner;
class Tokenizer
{
  public static void main(String args[])
  {
    System.out.println("enter a line of integers with one space among them-");
    Scanner s=new Scanner(System.in);
    String str=s.nextLine(); 
    int sum=0;
    StringTokenizer st = new StringTokenizer(str," ");
    while(st.hasMoreTokens())
    {
      int n = 0;
      n = Integer.parseInt(st.nextToken());
      System.out.println("Number is: "+n);
      sum += n;
    }
    System.out.println("sum of integers in a given line is" + sum);
  }
}