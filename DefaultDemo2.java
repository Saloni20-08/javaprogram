class Demo2 {
    public int a, b; 
    public void display()
    {
        System.out.println("a = " + a + " and b = " + b);
    }
}

public class DefaultDemo2 {
    public static void main(String[] args) {
        Demo2 d1 = new Demo2(); 
        Demo2 d2 = new Demo2(); 
        d1.display(); 
        d2.display(); 
    }
}
