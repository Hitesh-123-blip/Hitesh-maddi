import java.util.Scanner;
public class CountVowelsDigits
{
  public static void main(String args[])
  {
    String str;
    System.out.println("enter a string");
    Scanner s=new Scanner(System.in);
    str=s.next();
    int strl=str.length();
    int count_v=0,count_n=0;
    for(int i=0;i<=strl-1;i++)
    {
      if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
      {
        count_v+=1;
      }
      if(str.charAt(i)=='0'||str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9')
      {
        count_n+=1;
      }
    }
   float p1=(count_v*100/strl);
   float p2=(count_n*100/strl);
   System.out.println("no of vowels in a given string is: " + count_v );
   System.out.println("no of integers in a given strings: " + count_n );
   System.out.println("percentsge of vowels in a string" + p1);
   System.out.println("percentage of num in a given string" + p2);  
  }
}