 import java.util.Scanner;
class lar_smal
{
 public static void main(String args[])
  {
    int n;
    System.out.println("enter a no of elements");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    System.out.println("enter the elements");
    int a[]=new int[n];
    for(int i=0;i<n;i++)
     {
       a[i]=s.nextInt();
     }
    int temp;
    for(int i=0;i<n;i++)
     {
       for(int j=i+1;j<n;j++)
        {
          if(a[i]>a[j])
           {
             temp=a[i];
             a[i]=a[j];
	     a[j]=temp;
   	   }
        }
     }
     System.out.println("smallest element in the list: " + a[0]);
       System.out.println("largest element in the list: " + a[n-1]);
  }
}