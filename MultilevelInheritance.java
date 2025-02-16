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

// Class C (Derived class of B, so indirectly inherits from A as well)
class C extends B {
    // Method in class C
    public void check() {
        System.out.println("This is check of class C");
    }
}

// Main class to demonstrate multilevel inheritance
public class MultilevelInheritance {
    public static void main(String[] args) {
        // Creating an object of class A
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
        c1.get();  // Inherited from class B
        c1.check();  // Method from class C
    }
}
