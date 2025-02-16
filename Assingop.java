import java.util.Scanner;
public class Assingop {
 public static void main(String args[]){
  // int x = 10, y = 20;
  int x,y;
  Scanner scanner = new Scanner (System.in);
  System.out.println("Enter the value of x : ");
  x=scanner.nextInt();
  System.out.println("Enter the value of y : ");
  y=scanner.nextInt();

  int z = x++;
  int m = ++x;
  System.out.println("z = " + z);
  System.out.println("m = " + m);
  System.out.println("x = " + x);
  System.out.println("y = " + y);
  System.out.println("x++ = " + z);
  System.out.println("++x = " + m);
  System.out.println("x += y = " + (x += y));
  System.out.println("x -= y = " + (x -= y));
  System.out.println("x *= y = " + (x *= y));
  System.out.println("x/= y = " + (x/= y));
  
 }
}