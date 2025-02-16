 import java.util.Scanner;
class circle
{
    public static void main(String[] args) 
    {
      double a ,b ,sum ,avg;
      System.out.println("ENTER THE VALUE OF a");
     Scanner in=new Scanner (System.in);
      a=in.nextDouble();
      System.out.println ("ENTER THE VALUE OF b");
      b=in.nextDouble();
      sum=a+b;
      avg=sum/2;
      System.out.print("sum="+sum);
      System.out.print("avg="+avg);
      in.close();

    }
    
}