import java.util.*;
class Book
{
   public String bookName;
   public int ISBN;
   public String authorName;
   public String Publisher;
   
   public Book(String b,int I,String a,String p)
    {
      setBookName(bookName);
      setISBN(ISBN);
      setAuthorName(authorName);
      setPublisher(Publisher);
        bookName=b;
        ISBN=I;
        authorName=a;
        Publisher=p;
      }
      public String getBookName()
      {
       return bookName;
      }
      public void setBookName(String bname)
      {
       bookName=bname;
      }
     public int getISBN()
      {
       return ISBN;
      }
      public void setISBN(int isb)
      {
       ISBN=isb;
      }
      public String getAuthorName()
       {
        return authorName;
        }
        public void setAuthorName(String aname)
        {
        authorName=aname;
        }
        public String getPublisher()
        {
         return Publisher;
        }
        public void setPublisher(String pname)
       {
       Publisher=pname;
       }
}
class BookTest
{
  public static void main(String[] args)
  {
    Scanner S=new Scanner(System.in);
     System.out.println("Enter the book name: ");
     String bname=S.next();
      System.out.println("Enter the ISBN no: ");
       int isb=S.nextInt();
       System.out.println("Enter the author name: ");
        String aname=S.next();
         System.out.println("Enter the publisher name: ");
         String pname=S.next();
      System.out.println("book name  :" +bname);
      System.out.println("ISBN no:" +isb);
      System.out.println(" author name :" +aname);
      System.out.println(" publisher :" +pname);

      
}
}

         

