import java.util.Scanner;
class palindrome
{
  public static void main(String args[])
  {
   String st;
   System.out.println("enter a string");
   Scanner s=new Scanner(System.in);
   st=s.next();
   int i=0,j=st.length()-1;
   while(i<j)
   {
     if(st.charAt(i)!=st.charAt(j))
     {
      System.out.println("not a palindrome");
     }
     i++;
     j++;
   } 
  }
}

