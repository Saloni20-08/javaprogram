class A {
    public void set() {
        System.out.println("This is set of class A");
    }
}
class B extends A 
{
    public void get()
     {
        System.out.println("This is get of class B");
    }
}
class C extends B 
{
    public void check() 
    {
        System.out.println("This is check of class C");
    }
}
class D extends B
{
    public void put()
    {
        System.out.println("This is put of class D");
    }
}
public class HybridInheritance 
{
    public static void main(String[] args) 
    {
        A a1 = new A();
        System.out.println("Using object of base class A:");
        a1.set();
        B b1 = new B();
        System.out.println("Using object of derived class B:");
        b1.set();  
        b1.get();  
        C c1 = new C();
        System.out.println("Using object of derived class C:");
        c1.set();  
        c1.get(); 
        c1.check();  
        D d1 = new D();
        System.out.println("Using object of derived class D:");
        d1.set();
        d1.get(); 
        d1.put();  
    }
}