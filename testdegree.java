import java.util.Scanner;
class admission
{
  int ad_no;
  String std_name;
  admission(int an,String sn)
  {
   ad_no=an;
   std_name=sn;
  }
  void printdata()
  {
    System.out.println("admission number is: " + ad_no);
    System.out.println("student name is: " + std_name);
  }
}
class btech extends admission
{
  btech(int an,String sn)
  {
    super(an,sn);
  }
  void degree(int n)
   {
     if(n>=45)
       System.out.println("your UG degree certificate was approved");
     else
       System.out.println("your UG degree certificate was not approved");
   } 
}
class mtech extends admission
{
  mtech(int an,String sn)
  {
    super(an,sn);
  }
  void degree(int n)
   {
     if(n>=45)
       System.out.println("your PG degree certificate was approved");
     else
       System.out.println("your PG degree certificate was not approved");
   } 
}
class testdegree
{
  public static void main(String args[])
  {
   int adno;
   String stdname;
   System.out.println("enter the adno and student name");
   Scanner s=new Scanner(System.in);
   adno=s.nextInt();
   stdname=s.next();
   System.out.println("enter the degree 1)b.tech or 2)m.tech");
   int key=s.nextInt();
   switch(key)
   {
     case 1:  System.out.println("enter the study percentage of the student");
              int p=s.nextInt();
               btech b=new btech(adno,stdname);
               b.degree(p);
               break;
    case 2:   System.out.println("enter the study percentage of the student");
              int q=s.nextInt();
               mtech m=new mtech(adno,stdname);
               m.degree(q);
               break;
    default : System.out.println("enter the correct choice");
   }           
  }
}
