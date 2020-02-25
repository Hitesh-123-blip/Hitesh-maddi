import java.util.Scanner;
class palindrome
{
  String st;
  System.out.println("enter a string");
  Scanner s=new Scanner(System.in);
  st=s.next();
  int i=0,j=st.length()-1;
  while(i<j)
  {
   if(st.CharAt(i)!=st.CharAt(j))
    {
      System.out.println("not a palindrome");
    }
   i++;j++;
  }
  
}
class check
{
  public static void main(String args[])
   {
     palindrome p=new palindrome();
   }
}