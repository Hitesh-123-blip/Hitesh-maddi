import java.util.*;
interface grade
{
  int S=10,A=9,B=8,C=7,D=6,E=5,p=4,U=0,ab=0,w=0,i=0;
}
class semmarks implements grade
{
   
  /*int m1,m2,m3,m4,m5,m6;
  semmarks(int m1,int m2,int m3,int m4,int m5,int m6)
  {
    m1=m1;m2=m2;m3=m3;m4=m4;m5=m5;m6=m6;
  }*/
  void calculate(int a[],int n)
  {
    for(int i=0;i<n;i++)
    {
      if(a[i]>=90)
          a[i]=10;
      else if(a[i]>=80)
          a[i]=9;
      else if(a[i]>=70)
           a[i]=8;
      else if(a[i]>=60)
           a[i]=7;
      else if(a[i]>=50)
           a[i]=6;
      else if(a[i]>=40)
            a[i]=5;
      else
         a[i]=0;
     }
      float gpa=(1*a[0]+3*a[1]+3*a[2]+4*a[3]+5*a[4]+5*a[5])/(21);
      System.out.println("your gpa is: " + gpa);
   } 
}
class testsem
{
  public static void main(String args[])
 {
  int a[]=new int[6];
  System.out.println("enter the credit wise subjects starting from 1");
  Scanner s=new Scanner(System.in);
  for(int i=0;i<6;i++)
  {
    a[i]=s.nextInt(); 
  }
  semmarks sm=new semmarks();
  sm.calculate(a,6);
 }
}