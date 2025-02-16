class Calculator 
{
    public int add(int a, int b) {
        System.out.println("Adding two integers: " + a + " and " + b);
        return a + b;
    }
    public int add(int a, int b, int c) {
        System.out.println("Adding three integers: " + a + ", " + b + " and " + c);
        return a + b + c;
    }
    public double add(double a, double b) {
        System.out.println("Adding two double values: " + a + " and " + b);
        return a + b;
    }
}

public class calculator 
{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Result 1: " + calc.add(10, 20));    
        System.out.println("Result 2: " + calc.add(10, 20, 30)); 
        System.out.println("Result 3: " + calc.add(10.5, 20.5));
    }
}
