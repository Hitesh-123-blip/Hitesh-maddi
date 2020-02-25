import java.util.*;
class sortstrings
{
  public static void main(String args[])
  {
    ArrayList<String> al=new ArrayList<String>();
    System.out.println("enter the no of strings");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    System.out.println("enter the Strings");
    for(int i=0;i<n;i++)
    {
      al.add(s.next());
    } 
   Collections.sort(al); 
   System.out.println("sorted list of strings" + al);
  }
}