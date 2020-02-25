class Employee
{
 String Emp_name;
 double Emp_id;
 String Address;
 String Mail_id;
 double Mobile_no;
 Employee(String en,double eid,String ads,String mail,double mn)
   {
     Emp_name=en;
     Emp_id=eid;
     Address=ads;
     Mail_id=mail;
     Mobile_no=mn;
   }
  void calculate(double bp)
  {
  double da=(97/100)*bp;
  double hra=0.1*bp;
  double pf=(12/100)*bp;
  double scf=(0.001)*bp;
  double gross_sal=da+hra;
  double net_sal=gross_sal-(pf+scf);
  System.out.println("gross salary is" + gross_sal);
  System.out.println("gross salary is" + net_sal);
  } 
   void printdata()
  {
    System.out.println("employ name is: " + Emp_name + "\nemploy id is: " + Emp_id + "\naddress of employee: " + Address + "\nmail id: " + Mail_id + "\nmobile num: " + Mobile_no);
  }
}
class Programmer extends Employee
{
  double BasicPay;
  Programmer(String en,double eid,String ads,String mail,double mn,double BP)
   {
     super( en, eid, ads, mail, mn);
     BasicPay=BP;
   }
  
}
class AssistantProfessor extends Employee
{
  double BasicPay;
  AssistantProfessor(String en,double eid,String ads,String mail,double mn,double BP)
  {
     super( en, eid, ads, mail, mn);
    BasicPay=BP;
  }
  
}
class Professor extends Employee
{
  double BasicPay;
  Professor(String en,double eid,String ads,String mail,double mn,double BP)
  {
    super( en, eid, ads, mail, mn);
    BasicPay=BP;
  }
  
}
class Test
{
  
 public static void main(String args[])
  {
    Programmer p=new Programmer("Hitesh",4060,"kandukur","bunny@gmail.com",5298,45000);
     p.printdata();
    p.calculate(24000);
   
  }
}
