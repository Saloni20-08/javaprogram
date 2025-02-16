// Define the cons class with a parameterized constructor and a display method
class Const 
{
    public int a, b;
    public Const(int p, int q)
    {
        System.out.println("Inside Parameterized Constructor");
        a = p;
        b = q;
    }
    public void display() {
        System.out.println("a = " + a + " and b = " + b);
    }
}
class paraconst
{
    public static void main(String[] args)
     {
        
        Const c1 = new Const(10,20);
        Const c2 = new Const(4, 6);
        c1.display();
        c2.display();
    }
}

