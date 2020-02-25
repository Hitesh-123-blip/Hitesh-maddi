import java.util.Scanner;
class grade_stds
{
 public static void main(String args[])
 {
   int numStudents;
   Scanner s=new Scanner(System.in);
   System.out.println("enter the no of students");
   numStudents=s.nextInt();
   System.out.println("enter the grades of each students");
   int grades[]=new int[10];
   for(int i=0;i<numStudents;i++)
    {
      grades[i]=s.nextInt();
    }
   int t;
   for(int i=0;i<numStudents;i++)
    {
      for(int j=i+1;j<numStudents;j++)
      {
        if(grades[i]>grades[j])
         {
           t=grades[i];
           grades[i]=grades[j];
	   grades[j]=t;
         }
      }
    }
   int sum=0;
   for(int i=0;i<numStudents;i++)
    {
      sum+=grades[i];
    }
   double average=sum/numStudents;
   System.out.println("average is : " + average);
   int r=grades[0]/grades[numStudents-1];
   System.out.println("min/max is : " + r);
 }

}