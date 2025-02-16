class A 
{
    public int a;
    public A() 
    {
        a = 2; 
    }
}
class B extends A 
{
    public int a; 
    public B() 
    {
        super();  
        a = 3;   
    }
    public void show() 
    {
        System.out.println("a in base class: " + super.a);  
        System.out.println("a in derived class: " + a);
    }   
}
public class SuperDemo 
{
    public static void main(String[] args) 
    {
        B b1 = new B();  
        b1.show();
    }
}
