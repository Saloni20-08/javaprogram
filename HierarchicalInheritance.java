// Class A (Base class)
class A {
    // Method in class A
    public void set() {
        System.out.println("This is set of class A");
    }
}

// Class B (Derived class of A)
class B extends A {
    // Method in class B
    public void get() {
        System.out.println("This is get of class B");
    }
}

// Class C (Derived class of A)
class C extends A {
    // Method in class C
    public void check() {
        System.out.println("This is check of class C");
    }
}

// Main class to demonstrate hierarchical inheritance
public class HierarchicalInheritance {
    public static void main(String[] args) 
    {
        A a1 = new A();
        System.out.println("Using object of base class A:");
        a1.set();

        // Creating an object of class B
        B b1 = new B();
        System.out.println("Using object of derived class B:");
        b1.set();  // Inherited from class A
        b1.get();  // Method from class B

        // Creating an object of class C
        C c1 = new C();
        System.out.println("Using object of derived class C:");
        c1.set();  // Inherited from class A
        c1.check();  // Method from class C
    }
}