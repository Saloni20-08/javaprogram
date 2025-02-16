class cons
{
    public int a,b;
    public cons()
    {
        System.out.println("Iside Default constructor");
        a=15;
        b=20;
    }
    public void display()
     {
      System.out.println("a="+a+"and b="+b);
     }
}       
class default_const 
{
  public static void main(String[] args)
 {
  cons c1= new cons();
  cons c2= new cons();
  c1.display();
  c2.display();    
 }  
}
