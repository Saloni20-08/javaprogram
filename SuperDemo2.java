class A 
{
    public int a = 1; 
}
class B extends A 
{
    public int b = 2; 
    public B()  
    {
        super.a = 3;
    }
    public void show() 
    {
        System.out.println("a in base class: " + super.a);
        System.out.println("a in derived class: " + this.b);
    }
}
public class SuperDemo2 
{
    public static void main(String[] args) 
    {
        B b1 = new B(); 
        b1.show();
    }
}
