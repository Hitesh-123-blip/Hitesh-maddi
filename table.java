import java.util.Scanner;
class table
{
 public static void main(String args[])
 {
   int n;
   System.out.println("enter the num for table form");
   Scanner s=new Scanner(System.in);
   n=s.nextInt();
   for(int i=1;i<=10;i++)
    {
      System.out.println( n + "*"+i + "=" + n*i);
    }
 }
}