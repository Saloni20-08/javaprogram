// returning values from methods
public class Try2
{
    public static void main(String[] args)
    {
      int a= 10 ,b= 5 , c;
      Try2 my= new Try2();
      c =my.add(a,b);
      System.out.println("addition="+c);
    }  
    public int add(int x,int y)
    {
        int z;
        z=x+y;
        return z;
    }
}

