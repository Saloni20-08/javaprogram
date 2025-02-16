// complier time error (polymorphism)
class overm
{
 public void method()
{
    System.out.println("this is without parameter");
}
public void method(int x)
{
    System.out.println("this is integer parameter"+x);
}
public void method(double y)
{
    System.out.println("this is double parameter"+y);
}
public void method(String m)
{
    System.out.println("this is string parameter"+m);
}
}
public class overload
{
 public static void main(String[] args) 
 {
  overm in = new overm();
  in.method();
  in.method(5);
  in.method(16.5);
  in.method("love you");   
 }   
}
