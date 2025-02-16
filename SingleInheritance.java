// Base class A
class A {
    public int i, j; // Variables i and j in the base class

    // Method to display values of i and j
    public void showBase() {
        System.out.println("i and j of base class are: " + i + " and " + j);
    }
}

// Derived class B extending class A
class B extends A {
    public int k; // Variable k in the derived class

    // Method to display the value of k
    public void showDerived() {
        System.out.println("k of derived class is: " + k);
    }

    // Method to add and display the sum of i, j, and k
    public void addAll() {
        System.out.println("i + j + k = " + (i + j + k));
    }
}

// Main class to demonstrate single inheritance
public class SingleInheritance {
    public static void main(String[] args) {
        // Creating an object of the base class A
        A a1 = new A();

        // Creating an object of the derived class B
        B b1 = new B();

        System.out.println("Using object of base class");
        // Setting values for i and j in the base class object
        a1.i = 4;
        a1.j = 6;

        // Displaying base class values using the base class object
        a1.showBase();

        System.out.println("Using object of derived class");
        // Setting values for i, j, and k in the derived class object
        b1.i = 10;
        b1.j = 11;
        b1.k = 12;

        // Displaying base class values using the derived class object
        b1.showBase();

        // Displaying the derived class value
        b1.showDerived();

        System.out.println("Showing addition of all:");
        // Displaying the sum of i, j, and k
        b1.addAll();
    }
}