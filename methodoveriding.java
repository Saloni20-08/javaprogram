//methodoveriding program
class Add
{
    public void getResult(int a, int b)
    {
        System.out.println("sum of"+a+"and"+b+"is"+(a+b));
    }
}
class Multiply extends Add
{
 public void getResult(int a,int b)
 {
    System.out.println("Multiplication of"+a+"and"+b+"is"+(a*b));
 }
}
class Divide extends Multiply
{
    public void getResult(int a,int b)
    {
        System.out.println("Divide of"+a+"and"+b+"is"+(a/b));
    }
}
class methodoveriding
{
    public static void main(String[] args) 
    {
      Divide d= new Divide();
      d.getResult(12,4);  
    } 
}
