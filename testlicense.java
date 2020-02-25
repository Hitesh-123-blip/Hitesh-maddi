class llr
{
  int mark;
  String name;
  llr(int m,String n)
  {
    mark=m;
    name=n;
  }
  void cal()
  {
   if(mark<=13)
    System.out.println("you are disqualified for llr" + "Mr/Mrs" + name);
   else
    System.out.println("you are eligible for llr" + "Mr/Mrs" + name)
  }  
}
class twowheeler extends llr
{
  int no_of_mon;
  twowheeler(int m,String n,int nom)  
  {
    super(m,n);
    no_of_mon=nom;
  }
  if(mark>=13&&no_of_mon<=6)
    System.out.println("your driving licence(DL) was approved for two wheeler" + "\n thank you");
  else
    System.out.println("your driving licence(DL) was not approved for two wheeler" + "\n thank you");
}
class fourwheeler
{
  int no_of_mon;
  fourwheeler(int m,String n,int nom,)
  {
    super(m,n);
    no_of_mon=nom;
  }
  if(mark>=13&&no_of_mon<=6)
  {
    System.out.println("your driving licence(DL) was approved for four wheeler" + "\n thank you");
  }
  else
    System.out.println("your driving licence(DL) was not approved for 4 wheeler" + "\n thank you");
}
class testlicense
{
  public static void main(String argfs[])
   {
     int mark,nom;
     System.out.println("enter the name of the applicant");
     Scanner s=new Scanner(System.in);
     String name=s.next();
     System.out.println("enter the marks in llr test exam");
     mark=s.nextInt();
     System.out.println("enter the licence type 1)two wheeler\n 2)four wheeler");
     int key=s.nextInt();
     switch(key)
      {
        case 1:   System.out.println("enter the no of months completed after applying llr);
                  int nm=s.nextInt();   
                  twowheeler t=new twowheeler(mark,name,nm);
                  break;
        case 2:   System.out.println("enter the no of months completed after applying llr);
                  int nom=s.nextInt(); 
                  fourwheeler f=new fourwheeler(mark,name,nom);
                  break;
        default : System.out.println("enter a valid choice");       
      }
   }
}